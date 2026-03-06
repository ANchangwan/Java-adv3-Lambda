package lambda.lambda5.filter;

import java.util.List;


import static lambda.lambda5.filter.IntegerFilter.filter;

public class FilterMainV4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("evenNumbers = " + filter(numbers, n1 -> n1 % 2 == 0));

        System.out.println("oddNumbers = " + filter(numbers, n -> n % 2 == 1));

    }

}
