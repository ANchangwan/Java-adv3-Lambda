package stream.basic;

import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        List<Integer> originList = List.of(1, 2, 3, 4);
        System.out.println("originList : " + originList);

        List<Integer> filterList = originList.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("filterList : " + filterList);
        System.out.println("originList. : " + originList); //스트림은 원본 배열을 수정하지 않는다.
    }
}
