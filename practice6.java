package streamApi;
import java.util.*;
public class practice6 {
	public static void main(String[]args) {
		List<Integer>l1=Arrays.asList(18,45,99,13,47,76,54,34);
		l1.stream().sorted((a,b)->a-b).limit(2).skip(1)
		.forEach(System.out::println);
	}
}
