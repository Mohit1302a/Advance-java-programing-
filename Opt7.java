package streamApi;
import java.util.*;

public class Opt7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(12,5,20,8,30,5,8);
		
		List<Integer> sortedlist=list.stream().distinct().sorted((a,b)->b-a).limit(2).skip(1).toList();//get(1);also
		System.out.println(sortedlist);
	}

}
