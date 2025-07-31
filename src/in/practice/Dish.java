package in.practice;

public class Dish extends Thread{
	String dish;
	
	Dish(String dish){
		this.dish=dish;
	}
    public void run() {
    	System.out.println(dish+" "+"is getting ready");
    	try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
  }

class Cook {
	public static void main(String[] args) {
		Dish d1=new Dish("Pasta");
		Dish d2=new Dish("Momo");
		d1.start();
		d2.start();
	}
}
