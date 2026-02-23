package lambda.lambda3;

class GenericMain4 {

    public static void main(String[] args) {
        GenericFunction<String , String> uppercase = new GenericFunction<>() {
            @Override
            public String apply(String t) {
                return t.toUpperCase();
            }
        };

        String result = (String) uppercase.apply("Hello");
        System.out.println("result: " + result);

        GenericFunction<Integer, Integer> square = new GenericFunction<>() {
            @Override
            public Integer apply(Integer t) {
                return t * t;
            }
        };

        Integer result2 = square.apply(3);
        System.out.println("result2: " + result2);
    }

    @FunctionalInterface
    interface GenericFunction<T,R> {
        R apply(T t);
    }
}