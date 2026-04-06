package streamApi;

import java.util.*;

public class Pq2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(
            Arrays.asList(15, 22, 8, 40, 12, 35, 50, 5)
        );

        int secondLargest = numbers.stream()
                .sorted(Comparator.reverseOrder()) // sort descending
                .skip(1)                           // skip largest element
                .findFirst()                       // get next element
                .get();                            // extract value

        System.out.println(secondLargest);
    }
}