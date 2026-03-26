package streamApi;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Red3 {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(10,20,20,30,30,45,45);
		// TODO Auto-geneList<Integer>list=Arrays.asList(10,20,20,30,30,45,45);
		int max=list.stream().reduce(Integer::max).get();
		System.out.print(max);

	}

}
