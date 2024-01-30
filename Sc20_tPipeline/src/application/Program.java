package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10, 2, 7, 8);
        System.out.println("List = " + list);

        Stream<Integer> str1 = list.stream().map(x -> x * 10);
        System.out.println("str1 = " + Arrays.toString(str1.toArray()));

        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum of list = " + sum);

        List<Integer> newList = list.stream()
            .filter(x -> x % 2 == 0)
            .map(x -> x * 10)
            .collect(Collectors.toList());

        System.out.println("Pipeline = " + Arrays.toString(newList.toArray()));
    }
}
