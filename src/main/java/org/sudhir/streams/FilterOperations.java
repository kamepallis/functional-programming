package org.sudhir.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterOperations {
    public static void main(String[] args) {
        List<Integer> evenList = Stream.of(24, 27, 20, 145, 39)
                .filter(n -> n%2 ==0)
                .collect(Collectors.toList());
        evenList.forEach(System.out::println);
    }
}
