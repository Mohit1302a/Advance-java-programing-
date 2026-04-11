package streamApi;
import java.util.*;

public class Practice4 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(15, 22, 8, 40, 12, 35, 50, 5);

        int product = list.stream()
                .filter(n -> n % 2 == 0)   // keep only even numbers
                .reduce(1, (a, b) -> a * b); // multiply them

        System.out.println("Product of even numbers: " + product);
    }
}