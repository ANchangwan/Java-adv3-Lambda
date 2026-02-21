package lambda.lambda1;

import lambda.MyFunction;

public class SamMain {
    public static void main(String[] args) {
        SamInterface ns = () ->{
            System.out.println("Hello World");
        };

        MyFunction f = (int a, int b) ->{
            return a+b;
        };
        f.apply(1,2);
        System.out.println(f.apply(1,2));
        ns.run();
    }
}
