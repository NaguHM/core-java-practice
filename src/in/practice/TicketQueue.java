package in.practice;

import java.util.LinkedList;
import java.util.Queue;

public class TicketQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Queue<String> ticket =new LinkedList<>();
   ticket.offer("Nagu");
   ticket.offer("thanusha");
   ticket.offer("bhavya");
   ticket.offer("gayathri");
   ticket.offer("mahesha");
   
  /* while(!ticket.isEmpty()) {
	  String servedcustomer=ticket.poll();
	  System.out.println(servedcustomer);
	  
   }
	}*/
   System.out.println(ticket.poll());
   System.out.println(ticket.peek());
   System.out.println(ticket.size());
   
	}
}
