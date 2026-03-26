package streamApi;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Red7{

	public static void main(String[] args) {
		List<String>list=Arrays.asList("java","stream","python","javascript");
		// TODO Auto-geneList<Integer>list=Arrays.asList(10,20,20,30,30,45,45);
		String max=list.stream().reduce(" ",(a,b)->a+" "+b);
		System.out.print(max);

	}

}