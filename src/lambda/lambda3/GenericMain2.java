package lambda.lambda3;

class GenericMain2 {

    public static void main(String[] args) {
        GenericFunction<String> uppercase = s -> s.toUpperCase();

        String result = uppercase.apply("Hello");
        System.out.println("result: " +result);

        GenericFunction<Integer> square = n -> n * n;
        Integer result2 = square.apply(3);
        System.out.println("result2: " +result2);
    }

    @FunctionalInterface
    interface GenericFunction<T>{
        T apply(T t);

    }
    
}
