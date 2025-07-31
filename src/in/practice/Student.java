package in.practice;

public class Student implements Runnable {
	String name;
	
	Student(String name){
		this.name=name;
	}
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(name+" "+"writing the exam");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ExamHall{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread s1=new Thread(new Student("Ajith"));
		Thread s2=new Thread(new Student("Kanini"));
		s1.start();
		s2.start();
		

	}

}
