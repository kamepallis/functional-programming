package org.sudhir.section1;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

    public static void main(String ar[]) {
        int sumOfEvens = 0;

        /**
         * Declarative approach
         */
        for (int i=1;i<=100; i++) {
            if(i%2 == 0) {
                sumOfEvens = sumOfEvens + i;
            }
        }
        System.out.println(sumOfEvens);


        sumOfEvens = IntStream.rangeClosed(1,100)
                .filter(i->i%2==0)
                .reduce((x,y)-> x+y)
                .getAsInt();
        System.out.println(sumOfEvens);
    }
}
