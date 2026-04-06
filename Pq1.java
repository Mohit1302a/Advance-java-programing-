package streamApi;

import java.util.*;

public class Pq1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(
            Arrays.asList(15, 22, 8, 40, 12, 35, 50, 5)
        );

        int sum = numbers.stream()
                .sorted(Comparator.reverseOrder()) // sort descending
                .limit(3)                          // take top 3
                .reduce(0, (a, b) -> a + b);       // sum

        System.out.println( sum);
    }
}