package in.practice;

public class ATM extends Thread {
  
	String CustomerName;
	int amount;
	
	ATM( int amount, String CustomerName){
		this.CustomerName=CustomerName;
		this.amount=amount;
	}
	public void run() {
		System.out.println(CustomerName+" "+"started withdrawing"+" "+amount);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Machine {
	public static void main(String[] args) {
		ATM c1=new ATM(100000,"Nagu");
		ATM c2=new ATM(200000,"Mahesha");
		c1.start();
		c2.start();
		
	}
}
