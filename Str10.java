package streamApi;
import java.util.*;

public class Str10{

	public static void main(String[] args) {//important
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("java","springboot","Api","Microservices","SQL");
		
		List<String> sortedlist=list.stream().sorted((a,b)->a.length()-b.length()).toList();
		List<String> sortedlist1=list.stream().sorted((a,b)->b.length()-a.length()).toList();
		System.out.println(sortedlist);
		System.out.println(sortedlist1);
	}

}
