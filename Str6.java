package streamApi;
import java.util.*;

public class Str6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(23,12,1,45,23,76,26,91);
		
		List<Integer> sortedlist=list.stream().distinct().sorted((a,b)->b-a).limit(2).skip(1).toList();//get(1);also
		System.out.println(sortedlist);
	}

}
