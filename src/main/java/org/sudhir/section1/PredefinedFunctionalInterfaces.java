package org.sudhir.section1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterfaces {

    public static void main(String[] args) {

        /**
         * Predicate<T>
         *     boolean test(T t);
         * Takes one parameter and returns a boolean value true/false
         */
        Predicate<String> stringPredicate = s -> s.isEmpty();
        Predicate<Integer> evenPredicate = n -> n%2==0 ;
        System.out.println(stringPredicate.test(""));
        System.out.println(stringPredicate.test("DDF"));
        System.out.println(evenPredicate.test(4));
        System.out.println(evenPredicate.test(7));

        /**
         *  Consumer<T>
         *      void accept(T t)
         *  It takes one argument and returns nothing
         */
        Consumer<String> lengthConsumer = s -> System.out.println(s.length());
        Consumer<Integer> printConsumer =  n -> System.out.println(n);
        lengthConsumer.accept("Hello");
        printConsumer.accept(786);

        /**
         *  Supplier<T>
         *      T get();
         *  It takes no arguments but returns a type
         */
        Supplier<String> sringSupplier = () -> "Hello";
        Supplier<Double> intSupplier = () -> Math.random();
        System.out.println(sringSupplier.get());
        System.out.println(intSupplier.get());

        /**
         *  FUnction<T,R>
         *      R apply(T t);
         *  It takes an argument and returns same or different type
         */
        Function<String, String> stringFunction = s -> s.substring(0,2);
        Function<String, Integer> lengthFunction = s -> s.length();
        System.out.println(stringFunction.apply("Function"));
        System.out.println(lengthFunction.apply("Function"));


    }
}
