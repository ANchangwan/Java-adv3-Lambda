package lambda.lambda5.filter;

import java.util.List;



public class FilterMainV5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("evenNumbers = " + GenericFilter.filter(numbers, n1 -> n1 % 2 == 0));

        System.out.println("oddNumbers = " + GenericFilter.filter(numbers, n -> n % 2 == 1)); //타입추론
        
        //문자 사용 필터
        List<String> strings = List.of("A", "BB", "CCC");
        System.out.println(GenericFilter.filter(strings, s -> s.length() >= 2 ));

    }

}
