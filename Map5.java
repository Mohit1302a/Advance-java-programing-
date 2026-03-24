package streamApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Map5 {
	public static void main(String []args) {
		List<String>names=Arrays.asList("A","B","C");
		
		System.out.println(names);
		List<String> result = names.stream()
		        .map(n->"item"+n)
		        .toList();
				System.out.println(result);
	}
}
