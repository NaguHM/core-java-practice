package in.practice;

import java.util.HashSet;
import java.util.Set;

public class CommonUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Set<String> setA =new HashSet<>();
    Set <String> setB=new HashSet<>();
    
    setA.add("Ramya");
    setA.add("Nakul");
    setA.add("Nayana");
    setA.add("Druva");
    
    setB.add("Ramya");
    setB.add("Nayana");
    setB.add("Sanjana");
    
    setB.retainAll(setA);
   // setA.removeAll(setB);
    
    System.out.println(setB);
    
	}

}
