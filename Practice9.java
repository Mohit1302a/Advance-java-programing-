package streamApi;
import java.util.*;

public class Practice9 {
	public static void main(String []args) {
		List<Integer>l1=Arrays.asList(45,10,7,18,99,333,56,23);
		int max=l1.stream().max(Integer::compare).get();
		System.out.println("max is "+max);
		
		int max2=l1.stream().max((a,b)->a-b).get();
		System.out.println("max is "+max2);
	}

}
