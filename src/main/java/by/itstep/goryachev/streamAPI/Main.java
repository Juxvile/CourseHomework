package by.itstep.goryachev.streamAPI;


import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        int [] array = {-34, 32, 65, -78, -5, 29, 100};
//        for (int number : array) {
//            if (number > 0) {
//                System.out.print(number + " ");
//            }
//        }
//        System.out.println("Stream");
//        Stream<Integer> stream = Stream.of(-34, 32, 65, -78, -5, 29, 100);
//        stream
//                .filter(s -> s > 0)
//                .filter(s -> s % 2 == 0)
//                .forEach(System.out::println);
//        ArrayList <String> stringArrayList = new ArrayList<>();
//        Collections.addAll(stringArrayList, "Andrei", "Ilya", "Maxim", "Yakov", "Nikalai");
//        Stream <String> streamString = stringArrayList.stream();
//
//        streamString
//                .sorted((s1,s2) -> s2.length() - s1.length())
//                .forEach(System.out::println);
//
//        Stream<Integer> stream = Stream.of(5, 2, 42, -34, 21, -23, 7);
//            stream
//                    .sorted((n1,n2) -> Integer.compare(n2,n1))
//                    .forEach(System.out::println);
//
//        LongStream longStream = LongStream.of (423423424,24213213,4323434);

//        Stream <User> userStream = new User(("Petya53",23),
//        new User ("Petya76", 53),
//        new User ("Petya23", 18),
//        new User ("Petya98", 20),
//        new User ("Petya11", 31));
//
//        userStream
//                .forEach(user -> System.out.println(user.getName()));
//        userStream
//                .sorted(Comparator.comparing(User::getAge).reversed())
//                .forEach(System.out::println);

        Stream <Integer> integerStream = Stream.of(1,2,3,4,5,6);
        Optional <Integer> optional = integerStream.reduce((a,b) -> a-b);
        System.out.println(optional.get());
    }
}
