package streamApi;
import java.util.*;
import java.util.stream.*;
//important
public class Red13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // input number
        
        int result = IntStream.rangeClosed(1, n)
                              .reduce(1, (a, b) -> a *b);

        System.out.println(result);
    }
}