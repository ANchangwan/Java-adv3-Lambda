package lambda.lambda3;

class GenericMain5 {

    public static void main(String[] args) {
        GenericFunction<String , String> uppercase = (t) -> t.toUpperCase();

        String result = uppercase.apply("Hello");
        System.out.println("result: " + result);

        GenericFunction<Integer, Integer> square = t -> t * t;

        Integer result2 = square.apply(3);
        System.out.println("result2: " + result2);
    }

    @FunctionalInterface
    interface GenericFunction<T,R> {
        R apply(T t);
    }
}