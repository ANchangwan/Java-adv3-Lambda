package lambda.lambda2;

import lambda.MyFunction;

public class LambdaPassMain3 {
    public static void main(String[] args) {
        MyFunction add = getOperation("add");
        MyFunction sub = getOperation("sub");
        MyFunction mul = getOperation("mul");
        MyFunction div = getOperation("div");

        System.out.println("add: "+ add.apply(1,2));
        System.out.println("sub: "+ sub.apply(1,2));
        System.out.println("mul: "+ mul.apply(1,2));
        System.out.println("div: "+ div.apply(1,2));
    }

      static MyFunction getOperation(String operator) {
        switch (operator) {
            case "add":
                return (a, b) -> a + b;
                case "sub":
                    return (a, b) -> a - b;
                    case "mul":
                        return (a, b) -> a * b;
                        case "div":
                            return (a, b) -> a / b;
        };
        return null;
    };
}
