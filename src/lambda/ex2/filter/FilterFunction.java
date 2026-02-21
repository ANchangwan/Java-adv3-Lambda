package lambda.ex2.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterFunction {

    static List<Integer> filter(List<Integer> list, MyPredicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (predicate.test(i)) {
                result.add(i);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        List<Integer> numbers = List.of(-3, -2, -1, 1, 2, 3, 5);

        List<Integer> result = filter(numbers, value -> value < 0);
        System.out.println(result);

        List<Integer> result2 = filter(numbers, value -> value % 2 == 0);
        System.out.println("짝수만: "  + result2);
    }
}
