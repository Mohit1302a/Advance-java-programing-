package streamApi;
import java.util.*;

public class Str7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(23,12,1,45,23,76,26,91);
		
		List<Integer> sortedlist=list.stream().filter(a->a>20).sorted((a,b)->a-b).toList();//desending
//		List<Integer> sortedlist1=list.stream().sorted((a,b)->a-b).skip(list.size()-3).toList();//acending
		System.out.println(sortedlist);
//		System.out.println(sortedlist1);
	}

}
