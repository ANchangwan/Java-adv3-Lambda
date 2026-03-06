package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StringToIntegerMapper {
    public static List<Integer> map(List<String> list, Function<String, Integer> fn) {
        ArrayList<Integer> result = new ArrayList<>();
        for (String num : list){
            result.add(fn.apply(num));
        }
        return result;
    }
}
