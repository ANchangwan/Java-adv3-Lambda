package lambda.start;

import lambda.Procedure;

import java.util.Random;

public class Ex0MainV4 {


    public static void hello(Procedure f) {
        long startNs = System.nanoTime();
        f.apply();
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    public static void main(String[] args) {
        hello(() -> {
                int random = new Random().nextInt(6) + 1;
                System.out.println("random: " + random);
        });
        hello(() -> {
                int sum1 = 0;
                for(int i = 0; i < 3; i++){
                    sum1 += i;
                    System.out.println("i: " + i);
                }
            });
    }
}
