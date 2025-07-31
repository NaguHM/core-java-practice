package in.practice;

public class Download extends Thread {
	public void run() {
		for(int i=0;i<=5;i++) {
			 System.out.println(i);
	 }
		 System.out.println("Download completed");
	}
	
}

 class Upload extends Thread{
	 public void run() {
		 for(int i=0;i<=5;i++) {
			 System.out.println(i);
	 }
		 System.out.println("Upload completed");
	 }
	
}

 class Main{
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new Download().start();
     new Upload().start();
	}

}
