package streamApi;
import java.util.*;

public class Str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(23,12,1,45,23,76,26,91);
		
		List<Integer> sortedlist=list.stream().sorted().toList();
		System.out.println(sortedlist);
	}

}
