package in.practice;

public class Account {
	int balance=15000;
	synchronized void withdraw(String user,int amount ) {
		if(balance>=amount) {
			System.out.println(user+" "+"is withdrawing"+amount);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				balance=-amount;
				System.out.println("the balance amount is"+" "+balance);
			}
		}
		else {
			System.out.println("Insufficient balane");
		}
	}
	}

class User implements Runnable{
   Account account;
   String user;
   int amount;
   
   User(Account account,String user, int amount) {
	   this.account=account;
	   this.user=user;
	   this.amount=amount;
   }
   
 @Override
public void run() {
	// TODO Auto-generated method stub
	account.withdraw(user,amount);
}
}

class Bank{
	public static void main(String[] args) {
		Account a=new Account();
		Thread t1=new Thread(new User(a,"Ajith",5000));
		Thread t2=new Thread(new User(a,"Sneha",8000));
		t1.start();
		t2.start();
	}
}
