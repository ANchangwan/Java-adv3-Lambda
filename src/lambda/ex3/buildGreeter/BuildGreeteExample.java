package lambda.ex3.buildGreeter;

public class BuildGreeteExample {

    public static StringFunction buildGreeter(String greeting) {

        return str -> str + ", " + greeting;
    }


    public static void main(String[] args) {
        StringFunction result = buildGreeter("world");
        StringFunction lambda = buildGreeter("Lambda");

        System.out.println(result.apply("java"));
        System.out.println(lambda.apply("Spring"));

    }
}
