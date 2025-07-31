package in.practice;

import java.util.LinkedList;
import java.util.Queue;

public class BankQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Queue<String> queue=new LinkedList<>();
      queue.add("customer1");
      queue.add("customer2");
      queue.add("customer3");
      System.out.println(queue.poll());//remove
      System.out.println(queue.peek());//to view who is the head
      System.out.println(queue.offer("customer4"));//to add an element
      System.out.println(queue);
	}

}
