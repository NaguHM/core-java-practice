package in.practice;

public class StudentConstructor {
	String standard;
	int grade;
	
	public StudentConstructor(String standard,int grade) {
		this.standard=standard;
		this.grade=grade;
	}

	public StudentConstructor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		StudentConstructor s=new StudentConstructor();
		StudentConstructor s1=new StudentConstructor("2nd",100);
		
		
	}
}
