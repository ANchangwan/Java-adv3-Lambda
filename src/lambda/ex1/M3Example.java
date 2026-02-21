package lambda.ex1;

import lambda.Procedure;

import java.util.Arrays;

public class M3Example {
    static void measure(Procedure p){
        long startns = System.nanoTime();
        p.apply();
        long endns = System.nanoTime();
        System.out.println("Elapsed time: " + (endns - startns) + "ns");
    }

    public static void main(String[] args) {
         measure(() -> {
             int sum = 0;
             for (int i = 1; i <= 100; i++) {
                 sum += i;

             }
             System.out.println("1부터 100까지의 합: " + sum);
         });

         measure(() -> {
             int[] arr = {4,3,2,1};
             System.out.println("[원본배열]: " + Arrays.toString(arr));
             Arrays.sort(arr);
             System.out.println("[정렬된 배열]: " + Arrays.toString(arr));

         });

    }
}
