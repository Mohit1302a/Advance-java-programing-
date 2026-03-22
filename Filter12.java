package streamApi;
import java.util.*;

public class Filter12 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(-2,-4,88,-6,77,56,64);
		list.stream().filter(s->s>0)
		.forEach(System.out::println);
		// TODO Auto-generated method stub

	}

}
