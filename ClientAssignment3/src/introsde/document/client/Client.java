package introsde.document.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.Holder;
import javax.xml.ws.Service;

import introsde.assignment.soap.*;
import intrsde.utilities.Utilities;

public class Client {
	
	private PrintWriter out;
	
	/**
	 * ID of the first person
	 */
	private int ID;
	private DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
	
	public Client(String args[]) throws MalformedURLException{
		
		//String urlStr="http://127.0.1.1:6902/ws/people?wsdl";
		//String urlStr="https://assignment-3-tavonatti.herokuapp.com/ws/people?wsdl";
		String urlStr="https://scalco-introsde-assignment-3.herokuapp.com/ws/people?wsdl";
		
		if(args.length>0)
			urlStr=args[0];
		
		URL url = new URL(urlStr);
        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://soap.assignment.introsde/", "PeopleService");
        Service service = Service.create(url, qname);
        
        //initialize print writer for the log file
        initializePrintWriter();
        
        //print server url
        printOnScreen("Server URL: "+urlStr+"\n");
        printOnFile("Server URL: "+urlStr+"\n");
        
        //Method 1
        People people=service.getPort(People.class);
        if(people.readPersonList().getPerson().size()>0)
        	ID=people.readPersonList().getPerson().get(0).getIdPerson();
        
        String req1response="";
        
        List<Person> peopleList=people.readPersonList().getPerson();
        
        Iterator<Person> it=peopleList.iterator();
        
        while(it.hasNext()){
        	Person p=it.next();
        	req1response+=Utilities.printPerson(p)+"\n---\n";
        }
        
        print("1", "getPersonList()", req1response);
        
        //Method 2
        Person person=people.readPerson(ID);
        print("2", "readPerson(personid):", Utilities.printPerson(person));
        
        //Method 3
        //Changing name of first person
        person.setFirstname("Paolo"+(new Random()).nextInt(500));
        person.setLastname("Bitta");
        Holder<Person> personHolder=new Holder<Person>(person);
        people.updatePerson(personHolder);
        
        person= personHolder.value;
        
        print("3", "updatePerson("+person.getIdPerson()+"):\nnew person:", Utilities.printPerson(person));
		
        //Method 4
        
        //creating new person
        Person nervi=new Person();
        nervi.setFirstname("Luca");
        nervi.setLastname("Nervi");
        try {
        	GregorianCalendar gc=new GregorianCalendar();
        	gc.setTime(format.parse("1965-01-05"));
			nervi.setBirthdate(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc));
        } catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        Holder<Person> newPerson=new Holder<>(nervi);
        
        people.createPerson(newPerson);
        
        print("4","createPerson(): ",Utilities.printPerson(newPerson.value));
        
        nervi=newPerson.value;
        
        //Method 5 delete person
        Holder<Integer> deleteNervi=new Holder<>(nervi.getIdPerson());
        people.deletePerson(deleteNervi);
        
        print("5","deletePerson("+nervi.getIdPerson()+"): ","result: "+deleteNervi.value);
        
        //Method 6
        
        //insert a mesure before asking for history
        Measure toAdd=new Measure();
        toAdd.setMeasureType("height");
        toAdd.setMeasureValueType("double");
        toAdd.setMeasureValue(27);
        
        try {
        	GregorianCalendar gc=new GregorianCalendar();
        	gc.setTime(new Date(System.currentTimeMillis()));
        	toAdd.setDateRegistered(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc));
        } catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
        people.savePersonMeasure(ID, toAdd);
       
        //read measure history
        MeasureHistory mh= people.readPersonHistory(ID, "height");
        print("6","readPersonHistory("+ID+",\"height\"):",Utilities.printMeasureHistory(mh));
        
        //Method 7
        MeasureTypeList measureTypeList= people.readMeasureTypes();
        List<String> types=measureTypeList.getMeasureType();
        Iterator<String> type=types.iterator();
        
        String typesString="";
        
        while(type.hasNext()){
        	String t=type.next();
        	typesString+=t+"\n";
        }
        
        print("7", "getMeasureType", typesString);
        
        //Method 8
        Measure mes= people.readPersonMeasure(ID, mh.getMeasure().get(0).getMeasureType(), mh.getMeasure().get(0).getMid());
        
        print("8", "readPersonMeasure("+ID+", \"height\","+mh.getMeasure().get(0).getMid()+")",Utilities.printMeasure(mes));
        
        
        //Method 9
        Measure m=new Measure();
        m.setMeasureValueType("double");
        m.setMeasureValue(27);
        m.setMeasureType("steps");
        
        try {
        	GregorianCalendar gc=new GregorianCalendar();
        	gc.setTime(new Date(System.currentTimeMillis()));
			m.setDateRegistered(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc));
        } catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
        
        
        Person bitta=people.savePersonMeasure(ID, m);
        print("9","savePersonMeasure("+ID+",m)",Utilities.printPerson(bitta));
        
        
        //Method 10
        mes.setMeasureValue((new Random()).nextInt(50));
        Holder<Measure> measureUpdate=new Holder<>(mes);
        people.updatePersonMeasure(ID, measureUpdate);
        
        print("10","updatePersonMeasure("+ID+",measure)",Utilities.printMeasure(measureUpdate.value));
        
        
        //close print writer
        closePrintWriter();
	}
	
	private void initializePrintWriter(){
		try {
			out= new PrintWriter(new FileOutputStream(new File("client_log.log")));
		} catch (FileNotFoundException e) {
			out=null;
			e.printStackTrace();
		}
	}
	
	private void closePrintWriter(){
		
		if(out==null)
			return;
		
		out.flush();
		out.close();
	}
	
	private void print(String num,String req, String response){
		String res="----------------------------------------------\n";
		res+="Request number: #"+num+": "+req;
		res+="\n\t"+response.replaceAll("\n", "\n\t");
		
		printOnFile(res);
		printOnScreen(res);
	}
	
	private void printOnFile(String str){
		if(out==null){
			return;
		}
		
		out.println(str);
	}
	
	private void printOnScreen(String str){
		System.out.println(str);
	}
	
	public static void main(String[] args) {
        try {
			new Client(args);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
    }
}
