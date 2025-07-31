package in.practice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<String> list=new ArrayList<>();
   list.add("Apple");
   list.add("banana");
   list.add("custard");
   
   ListIterator<String> it=list.listIterator();
   while(it.hasNext()) {
	   System.out.println(it.next());
   }
   while(it.hasPrevious()) {
	   System.out.println(it.previous());
   }
   
	}

}
