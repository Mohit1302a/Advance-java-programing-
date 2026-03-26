package streamApi;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Red9 {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(12,45,67,23,89,34,78);
		// TODO Auto-geneList<Integer>list=Arrays.asList(10,20,20,30,30,45,45);
		int max=list.stream().reduce(0,(a,b)->a>b?a:b);
//		System.out.print(max);
		int smax=list.stream().reduce(0,(a,b)->a>b && a<max?a:b);
		System.out.print(smax);
	}

}
