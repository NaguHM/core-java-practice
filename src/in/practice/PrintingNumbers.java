package in.practice;

public class PrintingNumbers extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		PrintingNumbers p1=new PrintingNumbers();
		PrintingNumbers p2=new PrintingNumbers();
		
		p1.start();
		p2.start();
	}

}

 
