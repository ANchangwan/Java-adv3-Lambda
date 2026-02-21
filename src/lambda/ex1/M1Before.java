package lambda.ex1;

public class M1Before {
    public static void greet(Say say) {
        System.out.println("=== 시작 ===");
        System.out.println("Good "+ say.told());
        System.out.println("=== 끝 ===");
    }


    public static void main(String[] args) {
        greet(() -> "morning");
        greet(() -> "night");
        greet(() -> "night");


    }
}
