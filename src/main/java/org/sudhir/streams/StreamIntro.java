package org.sudhir.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntro {
    public static void main(String[] args) {
            List<Book> books = new ArrayList<>();
            List<Book> result = new ArrayList<>();

            // Before java8
            for (Book b : books) {
                if (b.getGenre().equals("Horror") && (b.getRating() > 3)) {
                    result.add(b);
                }
            }
            System.out.println("Result:" + result);

            // After Java 8
            result = books.stream().filter(b-> b.getGenre().equals("Horro"))
                    .filter(b->b.getRating()>3)
                    .collect(Collectors.toList());

            //1. SOURCE Create the stream object from list
            Stream<Book> bookStream = books.stream();
            //2: INTEMEDIATE OPS
            Stream<Book> horrorStream = bookStream.filter(b -> b.getGenre().equals("Horror"));
            //3:INTERMEDIATE OPS
            Stream<Book> ratingStream = horrorStream.filter(b -> b.getRating() > 3);
            //4: TERMINAL OPS
            List<Book> books2 = ratingStream.collect(Collectors.toList());
            System.out.println("Book2:"+ books2);

    }
}
