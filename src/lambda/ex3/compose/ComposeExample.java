package lambda.ex3.compose;

public class ComposeExample {
    public static MyTransformer compose(MyTransformer f1, MyTransformer f2) {

        return s -> f1.transform(f2.transform(s));
    }
    public static void main(String[] args) {
        MyTransformer toUpper = s -> s.toUpperCase();
        MyTransformer addDeco = s -> "**" + s + "**";

        MyTransformer composeFunc = compose(toUpper, addDeco);
        System.out.println(composeFunc.transform("hello"));
    }
}
