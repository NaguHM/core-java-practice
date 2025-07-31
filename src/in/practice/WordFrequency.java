package in.practice;

import java.util.HashMap;

public class WordFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String sentence="java is powerful and java is easy language";
     String[] words=sentence.split(" ");
     HashMap<String,Integer> map=new HashMap<>();   
     
     for(String word:words) {
    	 map.put(word,map.getOrDefault(word, 0)+1);
    	 System.out.println(map);
     }
     
	}
}
