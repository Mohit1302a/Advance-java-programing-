package streamApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map8 {
	public static void main(String []args) {
		List<Integer>names=Arrays.asList(5,7,4,3,66,54,43,65);
		
		System.out.println(names);
		List<Integer> result = names.stream()
		        .map(n->n*2)
		        .collect(Collectors.toList());
				System.out.println(result);
	}
}
