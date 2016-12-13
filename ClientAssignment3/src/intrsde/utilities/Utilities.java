package intrsde.utilities;

import java.util.Iterator;
import java.util.List;

import introsde.assignment.soap.*;
public class Utilities {

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
		return "\n"+m.getMeasureType()+"(mid:"+m.getMid()+ "): "+m.getMeasureValue();
	}
}
