package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 4, 3, 10, 2);
        Stream<Integer> str1 = list.stream();
        System.out.println("str1: " + Arrays.toString(str1.toArray()));

        Stream<String> str2 = Stream.of("Maria, Bob, Alex");
        System.out.println("str2: " + Arrays.toString(str2.toArray()));

        Stream<Integer> str3 = Stream.iterate(0, x -> x + 2);
        System.out.println("str3: " + Arrays.toString(str3.limit(10).toArray()));

        Stream<Long> str4 = Stream.iterate(new long[]{0L, 1L}, p -> new long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println("str4: " + Arrays.toString(str4.limit(10).toArray()));
    }
}
