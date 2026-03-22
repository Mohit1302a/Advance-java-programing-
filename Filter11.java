package streamApi;
import java.util.*;
public class Filter11 {
 public static void main(String[]args) {
	 List<String> list=Arrays.asList("java","Phython","Scala","kotlin");
	 list.stream().filter(s->s.endsWith("a"))
	 .forEach(System.out::println);
 }
}
