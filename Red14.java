package streamApi;
import java.util.*;
import java.util.Arrays;
import java.util.List;
public class Red14 {

	public static void main(String[] args) {
		int value =123456;
		

		int rel=String.valueOf(value).chars().map(c->c-'0').reduce(0,(a,b)->a+b);
		System.out.println(rel);

	
		// TODO Auto-geneList<Integer>list=Arrays.asList(10,20,20,30,30,45,45);
	

	}

}
