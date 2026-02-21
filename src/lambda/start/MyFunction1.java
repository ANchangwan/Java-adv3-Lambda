package lambda.start;

import lambda.MyFunction;

public class MyFunction1 {
    public static void main(String[] args) {
        MyFunction myFunction1 = (a,b) ->{
            return a+b;
        };
        int result = myFunction1.apply(1, 2);
        System.out.println(result);
    }
}
