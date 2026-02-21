package lambda.lambda2;

import lambda.MyFunction;

public class LambdaPassMain2 {
    public static void main(String[] args) {
        MyFunction add = (int a, int b) -> a + b;
        MyFunction sub = (int a, int b) -> a - b;

        System.out.println("변수를 통해 전달");

        calculate(add);
        calculate(sub);
    }
    static void calculate(MyFunction function){
        int a = 1;
        int b = 2;

        System.out.println("계산 시작");
        int result = function.apply(a, b);
        System.out.println("계산 결과: "+result);
    }
}
