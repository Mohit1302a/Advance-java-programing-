package streamApi;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Red6 {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(11,22,33,44,55,66,77,88);
		// TODO Auto-geneList<Integer>list=Arrays.asList(10,20,20,30,30,45,45);
		int max=list.stream().filter(s->s%2==0).reduce(0,(a,b)->a+b);
		System.out.print(max);

	}

}