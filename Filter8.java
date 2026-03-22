package streamApi;
import java.util.*;

public class Filter8 {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("java","","Spring","","Ai");
		list.stream().filter(s->!s.isEmpty())
		.forEach(System.out::println);
		// TODO Auto-generated method stub

	}

}
