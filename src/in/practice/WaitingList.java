package in.practice;

import java.util.LinkedList;

public class WaitingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedList<String> waitingList=new LinkedList<>();
  	waitingList.addLast("paitient1");
  	waitingList.addLast("paitient2");
  	
  	waitingList.addFirst("urgentpaitient");
  	waitingList.remove(1);
  	
  	System.out.println(waitingList);
  	
	}

}
