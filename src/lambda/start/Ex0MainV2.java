package lambda.start;

import lambda.Procedure;

import java.util.Random;

public class Ex0MainV2 {
    public static void hello(Procedure f){
        long startNs = System.nanoTime();

        f.apply();

        long endNs = System.nanoTime();

        System.out.println("실행 시간: " + (endNs - startNs) + "ns");

    }
    public static void main(String[] args) {

        Procedure disc = new Procedure(){

            @Override
            public void apply() {
                int random = new Random().nextInt(6) + 1;
                System.out.println("random: "+random);
            }
        };

        Procedure sum = new Procedure() {
            @Override
            public void apply() {
                int sum = 0;
                for(int i = 0; i < 10; i++){
                    sum += i;
                }
                System.out.println("sum: "+sum);
            }
        };
        hello(sum);
        hello(disc);

    }
}
