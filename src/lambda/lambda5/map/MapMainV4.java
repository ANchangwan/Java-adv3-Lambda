package lambda.lambda5.map;

import java.util.List;

public class MapMainV4 {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange");

        // string -> String
        List<String> upperFruits = GenericMapper.map(fruits, s -> s.toUpperCase());
        System.out.println(upperFruits);

        // string -> Integer
        List<Integer> lengthFruits = GenericMapper.map(fruits, s -> s.length());
        System.out.println(lengthFruits);
        
        // Integer -> String
        List<Integer> integers = List.of(1, 2, 10);
        List<String> startList = GenericMapper.map(integers, "*"::repeat);
        System.out.println(startList);


    }
}
