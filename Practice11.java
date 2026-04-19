package streamApi;
import java.util.*;
public class Practice11 {
	public static void main(String[]args) {
		List<Integer>l1=Arrays.asList(22,45,56,76,98,76,22,45);
		l1.stream().limit
		(4)
		.forEach(System.out::println);
	}
}
