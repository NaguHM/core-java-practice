package in.practice;

public class Database { //Singleton
	
	private static Database instance;
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		
			if(instance==null) {
				instance=new Database();
			}
			return instance;
		
	}
}

class Test{
  public static void main(String[] args) {
		// TODO Auto-generated method stub
      Database d=Database.getInstance();
      Database d2=Database.getInstance();
	}

}
