package streamApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Map3 {
	public static void main(String []args) {
		List<String>names=Arrays.asList("sachin","rahul","amit");
		
		System.out.println(names);
		List<Character> result = names.stream()
		        .map(n-> n.charAt(0))
		        .toList();
				System.out.println(result);
	}
}
