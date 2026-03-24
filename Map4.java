package streamApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Map4 {
	public static void main(String []args) {
		List<Integer>numbers=Arrays.asList(23,32,45,35,67,89);
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.addAll(numbers);
		System.out.println(list);
		List<String>result=list.stream().map(n->String.valueOf(n)).toList();
				System.out.println(result);
	}
}
