package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV2 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        // 문자열을 숫자로 변환
        List<Integer> toValues = map(list, s -> Integer.valueOf(s));
        System.out.println("numbers = " + toValues);

        // 문자열의 길이
        List<Integer> toLength = map(list, String::length);
        System.out.println("lengths = " + toLength);

    }

    private static List<Integer> map(List<String> list, Function<String, Integer> fn) {
        ArrayList<Integer> result = new ArrayList<>();
        for (String num : list){
            result.add(fn.apply(num));
        }
        return result;
    }

}
