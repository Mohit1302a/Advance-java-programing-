package streamApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map6 {
	public static void main(String []args) {
		List<String>names=Arrays.asList("Java", "Stream", "API");
		
		System.out.println(names);
		List<Integer> result = names.stream()
		        .map(String::length)
		        .collect(Collectors.toList());
				System.out.println(result);
	}
}
