package org.sudhir.section1;

public class HelloLambda {

    public static void main(String[] args) {
        /**
         * This block of code is before the Lambda         *
         */
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Without lambda i.e Anonymus");
            }
        });

        t1.start();

        /**
         * This is lambda implementation
         */
        Thread t2 = new Thread(
                () -> System.out.println("This is Lambda"));
        t2.start();
    }
}
