package streamApi;
import java.util.*;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class Filter5{
	public static void main(String[]args) {
	   
  List<String> words=Arrays.asList("java",null,"null","rreact");
  words.stream().filter(Objects::nonNull)
  .forEach(System.out::println);
	}
}