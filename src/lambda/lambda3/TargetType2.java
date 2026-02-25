package lambda.lambda3;

import java.util.function.Function;

public class TargetType2 {
    public static void main(String[] args) {
       Function<String, String> uppercase = s -> s.toUpperCase();
       System.out.println(uppercase.apply("hello"));

       Function<Integer, Integer> squere = n -> n * n;
       System.out.println(squere.apply(3));

    }

}
