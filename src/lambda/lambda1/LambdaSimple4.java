package lambda.lambda1;

import lambda.MyFunction;
import lambda.Procedure;

public class LambdaSimple3 {
    public static void main(String[] args) {

        // 타입 생략 전
        MyFunction f1 = (int a,int b) -> a+b;

        // 타입 생략, 타입 추론
        MyFunction f2 = (a,b) -> a+b;


        int result = f2.apply(1,2);
        System.out.println(result);


    }
}
