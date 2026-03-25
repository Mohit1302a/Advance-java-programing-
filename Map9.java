package streamApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map9 {
	public static void main(String []args) {
		List<String>names=Arrays.asList("1", "2", "3");
		
		System.out.println(names);
		List<Integer> result = names.stream()
		        .map(Integer::parseInt)
		        .collect(Collectors.toList());
				System.out.println(result);
	}
}
