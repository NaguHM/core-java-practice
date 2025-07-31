package in.practice;

public class TrafficSignal extends Thread{

	String color;
	
	TrafficSignal(String color){
		this.color=color;
		}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("The traffic signal thats displaying is on and the color showing is"+color);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
	class Demo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficSignal red=new TrafficSignal("red");
		TrafficSignal yellow=new TrafficSignal("yellow");
		TrafficSignal green=new TrafficSignal("green");
		red.start();
		yellow.start();
		green.start();

	}

}
