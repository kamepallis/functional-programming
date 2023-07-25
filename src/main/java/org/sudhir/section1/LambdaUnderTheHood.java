package org.sudhir.section1;

public class LambdaUnderTheHood {

    public static void main(String[] args) {
        MyFunctionalInterface func1 = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Annonyus IMplementation");
            }
        };
        func1.myMethod();

        MyFunctionalInterface func2 = () -> System.out.println("Lambda implementation");
        func2.myMethod();

        onTheFly(func2);

        onTheFly(()-> System.out.println("On the Fly: Behaviour Passing"));
    }

    public static void onTheFly(MyFunctionalInterface fun) {
        fun.myMethod();
    }
}
