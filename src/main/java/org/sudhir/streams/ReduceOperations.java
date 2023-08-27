package org.sudhir.streams;

import java.util.stream.Stream;

public class ReduceOperations {
    public static void main(String[] args) {
        Integer sum = Stream.of(1,2, 3, 37, 45, 99)
                .reduce(0, (a,b)-> a+b);
        System.out.println("Sum:"+ sum);
    }
}
