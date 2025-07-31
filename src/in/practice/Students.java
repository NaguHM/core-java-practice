package in.practice;

import java.util.ArrayList;
import java.util.Collections;


public class Students implements Comparable<Students> {
	
 String name;
 int marks;
 
 Students(String name,int marks){
	 this.name=name;
	 this.marks=marks;
 }
	
	@Override
	public int compareTo(Students s) {
		// TODO Auto-generated method stub
		return this.marks-s.marks;
	}
   public String toString() {
	return name +":"+marks;
	   
   }

}

class ComparableDemo{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Students> list=new ArrayList<>();
    
    list.add(new Students("Anu",85));
    list.add(new Students("Nagu",100));
    
    Collections.sort(list);
    System.out.println(list);
    
	}
}
