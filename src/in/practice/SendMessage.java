package in.practice;

public class SendMessage implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("sending message");
	}
}

class RecieveMessage implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Recieved message");
	}
}

class ChatApp{
	public static void main(String[] args) {
		Thread sender=new Thread(new SendMessage());
		Thread reciever=new Thread(new RecieveMessage());
		sender.start();
		reciever.start();
	}
}
