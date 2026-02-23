package lambda.start;

import lambda.Procedure;

import java.util.Random;


public class Ex0main {


    static class Dice implements Procedure {
        @Override
        public void apply() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
    }
    static class Sum implements Procedure{

        @Override
        public void apply() {
            int sum = 0;
            for (int i = 0; i < 3; i++){
                sum += i;
                System.out.println("i = " + i);
            }
        }
    }


     public static void hello(Procedure f) {
        long startNs = System.nanoTime();
        f.apply();
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    public static void main(String[] args) {
         Procedure sum = new Sum();
         Procedure dice = new Dice();
         hello(dice);
         hello(sum);
    }

}
