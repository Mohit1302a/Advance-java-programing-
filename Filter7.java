
		package streamApi;
  	import java.util.*;
		import java.util.stream.Stream;
		import java.util.function.Predicate;

		public class Filter7{
			 public static void main(String[]args) {
				 ArrayList <Integer> list=new ArrayList<Integer>(); 
				 list.add(10);
				 list.add(15);
				 list.add(20);
				 list.add(25);
				 list.add(30);
				 list.addAll(List.of(11,17,16));
				 System.out.println(list);
				 Stream listStream=list.stream();
				// listStream.forEach((element)-> System.out.print(element+" "));
				 list.stream().filter(n->n%5==0).forEach((n)-> System.out.print(n+" "));
	}

}
