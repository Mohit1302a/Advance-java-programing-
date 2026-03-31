package streamApi;
import java.util.*;

public class Str11{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(5,25,35,42,30,76,26,91);
		
		List<Integer> sortedlist=list.stream().filter(a->a%5==0).sorted((a,b)->a-b).toList();//desending
//		List<Integer> sortedlist1=list.stream().sorted((a,b)->a-b).skip(list.size()-3).toList();//acending
		System.out.println(sortedlist);
//		System.out.println(sortedlist1);
	}

}
