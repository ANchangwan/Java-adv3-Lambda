package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterMainV3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = filterEvenNumber(numbers);
        System.out.println("evenNumbers = " + evenNumbers);

        List<Integer> oddNumbers = filterOddNumber(numbers);
        System.out.println("oddNumbers = " + oddNumbers);

    }

    private static List<Integer> filterEvenNumber(List<Integer> numbers) {
        return numbers
                .stream()
                .filter(n -> n % 2==0)
                .toList();
    }

    private static List<Integer> filterOddNumber(List<Integer> numbers) {
        return  numbers.stream()
                .filter(n -> n % 2 == 1)
                .toList();
    }

}
