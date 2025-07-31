package in.practice;

class Kitchen{
	boolean orderPlaced=false;
	
	public synchronized void placeOrder() {
		orderPlaced=true;
		System.out.println("order placed in kitchen");
		notify();
	}
	
	public synchronized void WaitForOrder() throws InterruptedException {
		while(!orderPlaced) {
			System.out.println("chef waiting for order");
			wait();
		}
	}
		
	public synchronized void cookOrder() throws InterruptedException {
		System.out.println("chef is cooking");
		Thread.sleep(2000);
		System.out.println("order cooked");
	}
	}

class OrderThread extends Thread{
	Kitchen kitchen;
	
	public OrderThread(Kitchen kitchen) {
		this.kitchen=kitchen;
	}
	
	public void run() {
		System.out.println("Placing order");
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("order delivered");
		
		
	}
}

class ChefThread extends Thread{
	Kitchen kitchen;
	
	public ChefThread(Kitchen kitchen) {
		this.kitchen=kitchen;
	}
	
	public void run() {
		try {
			kitchen.WaitForOrder();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("chef sees other chef working");
			Thread.yield();
			synchronized (kitchen){
				try {
					kitchen.cookOrder();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
}

class DeliveryBoyThread extends Thread{
	ChefThread chef;
	
	public DeliveryBoyThread(ChefThread chef) {
		this.chef=chef;
	}
	
	public void run() {
		System.out.println("Delivery boy waiting chef to finish");
		try {
			chef.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class DeliverySystem{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Kitchen kitchen=new Kitchen();
      OrderThread order=new OrderThread(kitchen);
      ChefThread chef=new ChefThread(kitchen);
      DeliveryBoyThread deliveryBoy=new DeliveryBoyThread(chef);
      
      order.start();
      chef.start();
      deliveryBoy.start();
	}

}
