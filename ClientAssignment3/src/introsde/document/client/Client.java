package introsde.document.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import introsde.document.ws.GetPeopleList;
import introsde.document.ws.GetPeopleListResponse;
import introsde.document.ws.People;
import introsde.document.ws.Person;
import intrsde.utilities.Utilities;

public class Client {
	
	private PrintWriter out;
	
	/**
	 * ID of the first person
	 */
	private int ID;
	
	public Client(String args[]) throws MalformedURLException{
		
		String urlStr="http://127.0.1.1:6902/ws/people?wsdl";
		//String urlStr="https://assignment-3-tavonatti.herokuapp.com/ws/people?wsdl";
		
		if(args.length>0)
			urlStr=args[0];
		
		URL url = new URL(urlStr);
        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.document.introsde/", "PeopleService");
        Service service = Service.create(url, qname);
        
        //initialize print writer for the log file
        initializePrintWriter();
        
        //Method 1
        People people=service.getPort(People.class);
        if(people.getPeopleList().getPerson().size()>0)
        	ID=people.getPeopleList().getPerson().get(0).getIdPerson();
        
        String req1response="";
        
        List<Person> peopleList=people.getPeopleList().getPerson();
        
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
        people.updatePerson(person);
        
        person=people.readPerson(person.getIdPerson());
        
        print("3", "updatePerson("+person.getIdPerson()+"):\nnew person:", Utilities.printPerson(person));
		
        //Method 4
        
        
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
		res+="Req number: #"+num+": "+req;
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
