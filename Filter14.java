package streamApi; //filter duplicate
import java.util.*;

public class Filter14 {
public static void main(String[]args) {
	List<Integer>list=Arrays.asList(10,20,20,30,30,45,45);
	list.stream().distinct().filter(s->s>15)
	.forEach(System.out::println);
	
	
}
}
