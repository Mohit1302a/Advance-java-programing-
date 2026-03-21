package streamApi;
import java.util.*;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class Filter4 {
	public static void main(String[]args) {
	   
  List<String> words=Arrays.asList("java","python","c++","rreact");
  words.stream().filter(w->w.length()>4)
  .forEach(System.out::println);
	      
	     
	   
//	   		         Stream<String> l1Stream = l2.stream();

}
}