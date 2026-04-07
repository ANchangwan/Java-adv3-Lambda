package stream.operation;

import java.util.ArrayList;
import java.util.List;

public class MapVsFlatMapMain {
    public static void main(String[] args) {
        List<List<Integer>> outerList = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        List<Integer> forResult = new ArrayList<>();

        for (List<Integer> list : outerList){
            forResult.addAll(list);
        }
        System.out.println("forResult = " + forResult);
    }
}
