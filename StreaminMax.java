package streamApi;
import java.util.*;
import java.util.Optional;

import java.util.Arrays;

public class StreaminMax {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(10,20,30,40,60,50,80);
		Optional<Integer> result=nums.stream().min((a,b)->a-b); //display value at 0 after the sorting or operations 
		result.ifPresent(System.out::println);
		// TODO Auto-generated method stub

	}

}
