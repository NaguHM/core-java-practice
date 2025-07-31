package in.practice;

public class EvenNumber extends Thread {

	public void run() {
		for(int i=2;i<=10;i+=2) {
			System.out.println("The even no. are"+" "+i);
		}
	}
	
}

class OddNumber extends Thread{
	public void run() {
		for(int i=1;i<=9;i+=2) {
			System.out.println("The odd no. are"+" "+i);
		}
	}
}

class Number{
	public static void main(String[] args) {
		EvenNumber e=new EvenNumber();
		new OddNumber().start();
		e.start();
		
	}
}
