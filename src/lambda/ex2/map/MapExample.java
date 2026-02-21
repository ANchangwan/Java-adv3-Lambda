package lambda.ex2.map;

import java.util.ArrayList;
import java.util.List;

public class MapExample {

    public static List<String> map(List<String> list, MyFunction func) {
        ArrayList<String> result = new ArrayList<>();
        for(String str : list) {
            result.add(func.apply(str));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> res = List.of("hello", "java", "lambda");
        List<String> list = map(res, String::toUpperCase);
        System.out.println("list: "+list);

        List<String> list1 = map(res, str -> "***" + str + "***");
        System.out.println("list1: "+list1);
    }
}
