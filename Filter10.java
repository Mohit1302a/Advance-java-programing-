package streamApi;
import java.util.*;

import java.util.Arrays;

public class Filter10 {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(10,20,30,40,60,50,80);
		nums.stream().filter(s-> s>20 && s<50)
		.forEach(System.out::println);
		// TODO Auto-generated method stub

	}

}
