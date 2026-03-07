package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;

public class Ex1_Number {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> direct = direct(numbers);
        List<Integer> lambda = lambda(numbers);
        List<Integer> lambda2 = lambda2(numbers);
        System.out.println("direct : " + direct);
        System.out.println("lambda : " + lambda);
        System.out.println("lambda2 : " + lambda2);

    }
    static List<Integer> direct(List<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer number : numbers){
            if(number % 2 == 0){
                result.add(number * 2);
            }
        }
        return result;

    }
    static List<Integer> lambda(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 ==0)
                .map(n -> n * 2)
                .toList();

    }

    static List<Integer> lambda2(List<Integer> numbers){
        List<Integer> filter = GenericFilter
                .filter(numbers, s -> s % 2 == 0);

        return GenericMapper.map(filter, s -> s * 2);
    }
}
