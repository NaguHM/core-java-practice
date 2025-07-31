package in.practice;

import java.util.HashMap;

public class ContactBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<String,Long> phone=new HashMap<>();
    phone.put("Rekha",  10101010L);
    phone.put("shwetha", 2020202020L);
    phone.put("Nakshatra", 30405030L);
    System.out.println(phone.get("Rekha"));
    
	}

}
