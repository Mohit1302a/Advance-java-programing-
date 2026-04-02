package streamApi;
import java.util.*;

public class Opt5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(23,12,1,45,23,76,26,91);
		
		List<Integer> sortedlist=list.stream().skip(3).toList();//get(1);also
		System.out.println(sortedlist);
	}

}
