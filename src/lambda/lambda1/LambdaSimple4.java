package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple4 {
    public static void main(String[] args) {

        MyCall call1 = (int value) -> value + 1;
        MyCall call2 = (value) -> value + 2;
        MyCall call3 = value -> value + 3;





    }

    interface MyCall{
        int call(int a);
    }

}
