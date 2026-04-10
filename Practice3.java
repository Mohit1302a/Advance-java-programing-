package streamApi;
import java.util.*;

public class Practice3 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(15, 22, 8, 40, 12, 35, 50, 5);

        int sum = list.stream()
                .sorted((a, b) -> a - b) // descending order
                .limit(3)                // take top 3
                .reduce(0, Integer::sum); // sum them

        System.out.println("Sum of last 3 smallest numbers: " + sum);
    }
}