package stream.operation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperationsMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        // 1. filter
        numbers.stream()
                .filter(n -> n%2 ==0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 2. map
        numbers.stream()
                .map(n -> n * n)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 3. distinct
        numbers.stream()
                .distinct()
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 4. sotred(기본 정렬)
        Stream.of(3,4,5,67,2,1,2)
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 5. sorted(커스텀 정렬)
        Stream.of(3,4,5,67,2,1,2)
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 6. peek
        numbers.stream()
                .peek(n -> System.out.print("before: " + n + ", "))
                .map(n -> n*n)
                .peek(n -> System.out.print("after: " + n + ", "))
                .limit(5)
                .forEach(n -> System.out.println("최종값: "+ n));
        // 7. limit
        System.out.println("7. limit - 처음 5개 요소만");
        numbers.stream()
                .limit(5)
                .forEach(n -> System.out.print(n +" "));
        System.out.println("\n");

        // 9. skip
        System.out.println("8. skip - 처음 5개 요소를 건너뛰기");
        numbers.stream()
                .skip(5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        List<Integer> number2 = List.of(1, 2, 3, 4, 5, 1, 2, 3);
        // 9. takeWhile
        System.out.println("9. takeWhile - 5보다 작은 동안만 선택");
        number2.stream()
                .takeWhile(n -> n < 5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 10. dropWhile
        System.out.println("10. dropWhile - 5보다 작은 동안 건너뛰기");
        number2.stream()
                .dropWhile(n -> n < 5)
                .forEach(n -> System.out.print(n + " "));


    }
}
