package in.practice;

import java.util.Map;
import java.util.TreeMap;

public class SortStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeMap<String, Integer> Students=new TreeMap<>();
     Students.put("Zara",100);
     Students.put("Zoya",90);
     Students.put("Sahana", 95);
     
     
     
     for(Map.Entry<String, Integer> e:Students.entrySet()) {
    	 System.out.println(e.getKey()+" "+e.getValue());
     }
	}

}
