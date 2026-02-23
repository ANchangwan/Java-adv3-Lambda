package lambda.lambda3;

class GenericMain3 {

    public static void main(String[] args) {
        ObjectFunction uppercase = new ObjectFunction() {
            @Override
            public Object apply(Object t) {
                return ((String) t).toUpperCase();
            }
        };

        String result = (String) uppercase.apply("Hello");
        System.out.println("result: " + result);

        ObjectFunction square = new ObjectFunction() {
            @Override
            public Object apply(Object t) {
                Integer n = (Integer) t;
                return n * n;
            }
        };

        Integer result2 = (Integer) square.apply(3);
        System.out.println("result2: " + result2);
    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object t);
    }
}