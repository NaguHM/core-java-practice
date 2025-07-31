package in.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> names=Arrays.asList("alia","bobby","cathadril","cavin","alia","bobby");
       Set<String> unique=new HashSet<>(names);
       
       System.out.println(unique);
	}

}
