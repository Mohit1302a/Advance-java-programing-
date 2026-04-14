package streamApi;
import java.util.*;

public class Practice7{
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,50,60,70,75,80);

        List<Integer> list1 = list.stream()
                .sorted((a,b)->b-a)
                .limit(2)
                .toList();
        List<Integer> result= new ArrayList<>(list);
        result.removeAll(list1);
                // multiply all

        System.out.println("after remove lsit is "+result);
    }
}