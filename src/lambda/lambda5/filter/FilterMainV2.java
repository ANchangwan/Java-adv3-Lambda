package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("evenNumbers = " + filter(numbers, n1 -> n1 % 2 == 0));

        System.out.println("oddNumbers = " + filter(numbers, n -> n % 2 == 1));

    }

    private static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer number : numbers){
            if(predicate.test(number)){
                result.add(number);
            }
        }
        return result;
    }



}
