package streamApi;
import java.util.*;
public class Filter15 {
 public static void main(String[]args) {
	 List<String> list=Arrays.asList("java","Phython","Scala","kotlin");
	 list.stream().filter(s->s.contains("a"))
	 .forEach(System.out::println);
 }
}
