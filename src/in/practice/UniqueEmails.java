package in.practice;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Set<String> emails= new HashSet<>();
  emails.add("user1@eg.com");
  emails.add("user2@eg.com");
  emails.add("user1@eg.com");
  
  System.out.println(emails.contains("user2@eg.com"));
  System.out.println(emails);
  
	}

}
