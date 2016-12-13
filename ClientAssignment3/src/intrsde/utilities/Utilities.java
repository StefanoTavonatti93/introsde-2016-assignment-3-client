package intrsde.utilities;

import java.util.Iterator;
import java.util.List;

import introsde.assignment.soap.*;
public class Utilities {

	/**
	 * print a person in a formatted way
	 * @param p
	 * @return
	 */
	public static String printPerson(Person p){
		String res="";
		
		res+="ID: "+p.getIdPerson()+"\n";
		res+="Firstname: "+p.getFirstname()+"\n";
		res+="Lastname: "+p.getLastname()+"\n";
		res+="BirthDate: "+p.getBirthdate()+"\n";
		
		if(p.getHealthProfile()!=null)
			res+=printHealthProfile(p.getHealthProfile()).replaceAll("\n", "\n\t");
		
		return res;
	}
	
	/**
	 * print an health profile in a formatted way
	 * @param hp
	 * @return
	 */
	public static String printHealthProfile(HealthProfile hp){
		String res="Health Profile:\n\tCurrentHealth:";
		
		List<Measure> currentHealt= hp.getCurrentHealth().getMeasure();
		
		Iterator<Measure> it=currentHealt.iterator();
		
		while(it.hasNext()){
			Measure m=it.next();
			res+="\n\t\t"+m.getMeasureType()+"(mid:"+m.getMid()+ "): "+m.getMeasureValue();
		}
		
		return res;
	}
	
	/**
	 * print a measure in a formatted way
	 * @param mh
	 * @return
	 */
	public static String printMeasureHistory(MeasureHistory mh){
		String res="";
		
		List<Measure> measures=mh.getMeasure();
		Iterator<Measure> it=measures.iterator();
		
		while(it.hasNext()){
			Measure m=it.next();
			res+="\n\t"+m.getMeasureType()+"(mid:"+m.getMid()+ "): "+m.getMeasureValue();
		}
		
		return res;
	}
	
	public static String printMeasure(Measure m){
		if(m==null)
			return "";
		
		return "\n"+m.getMeasureType()+"(mid:"+m.getMid()+ "): "+m.getMeasureValue();
	}
}
