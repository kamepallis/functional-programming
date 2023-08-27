package org.sudhir.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapOperations {
    public static void main(String[] args) {
        List<Integer> list = Stream.of(27, 35, 20, 49, 44, 96)
                .map(n -> n*100)
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
