package in.practice;

import java.util.LinkedList;

public class Fixedsizebuffer {
	
	static int capacity=3;
	static LinkedList<String> errorLogs=new  LinkedList<>();
	
  public static void main(String[] args) {
	
	addLog("error1");
	addLog("error2");
	addLog("error3");
	addLog("error4");
	
	System.out.println(errorLogs);
	
  }
	static void addLog(String log) {
			if(errorLogs.size()==capacity) {
				errorLogs.removeFirst();
			}
			errorLogs.addLast(log);
		}
	

}
