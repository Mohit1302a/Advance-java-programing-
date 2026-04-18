package streamApi;
import java.util.*;

public class practice8 {
	public static void main(String[]args) {
		List<Integer>l1=Arrays.asList(3,5,67,97,85,35,42);
		int min=l1.stream().min(Integer::compare).get();
		
		System.out.println("min is "+min);
		
		int min2 = l1.stream()
	              .min((a, b) -> a - b)
	              .get();
		System.out.println("min is "+min2);
	            
	}

}
