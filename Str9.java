package streamApi;
import java.util.*;

public class Str9{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("Ravi","Ankit","Zoya","Meena","Kunal");
		
		List<String> sortedlist=list.stream().sorted().toList();
		System.out.println(sortedlist);
	}

}
