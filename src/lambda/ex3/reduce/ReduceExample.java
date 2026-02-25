package lambda.ex3.reduce;

import java.util.List;

public class ReduceExample {

    static int reducer(List<Integer> numbers,int init ,MyReducer reducer) {
        int result = init;

        for (int number : numbers) {
            result = reducer.reduce(result, number);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);

        // 합계
        int sum = reducer(list, 0,(acc, number) -> acc + number);
        System.out.println("합계: " + sum); // 10

        int multiply = reducer(list, 1,(acc,number) -> acc * number);
        System.out.println("곱셈: " + multiply); // 0 ⚠️

    }
}
