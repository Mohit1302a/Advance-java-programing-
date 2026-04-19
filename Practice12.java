package streamApi;
import java.util.*;

import java.util.Arrays;

public class Practice12 {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("ishan","ayush","aman","mohit","ishan");
			list.stream().distinct().forEach(System.out::println);
	}

}
