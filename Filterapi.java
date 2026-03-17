package streamApi;
import java.util.*;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class Filterapi {
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
		 listStream.forEach((element)-> System.out.print(element+" "));
		 list.stream().filter(n->n>60).forEach((n)-> System.out.print(n+" "));
		 list.stream().filter(n->n>50).forEach(System.out::println);
		 list.stream().filter(n->n>60).forEach(System.out::println);
		 
		 List<Integer>g60=list.stream().filter((n)->n>60 && n<90).toList();
		 System.out.println();
		 System.out.println(g60);
		// list.stream().forEach((element)-> System.out.print(element+" "));
		 System.out.println("count "+list.stream().filter((item)->item>60).count());
//		 
//		 
//		
//
		         ArrayList<String> l1 = new ArrayList<String>();

		         l1.add("Amit ");
		         l1.add("Ravi");
		         l1.add("Anil");
		         l1.add("Ram");
		         l1.add("Karan");

		         l1.addAll(List.of("Mohan", "Ravi", "Neha", "Priya", "John"));

		         System.out.println(l1);

	         Stream<String> l1Stream = l1.stream();
		         // Method reference
		         l1.stream().forEach(System.out::println);

		         // Lambda expression
	         l1.stream().forEach((element1) -> System.out.print(element1 + " "));
		     }
		 
		 
	 }


