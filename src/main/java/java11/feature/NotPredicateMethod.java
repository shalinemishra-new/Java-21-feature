package java11.feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotPredicateMethod {
    public static void main(String[] args) {

        List<Integer> list
                = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // creating a predicate for negation
        Predicate<Integer> even = i -> i % 2 == 0;

        // creating a predicate object which
        // is negation os supplied predicate

        Predicate<Integer> odd = Predicate.not(even);

        // filtering the even number using even predicate
        List<Integer> oddNumbers
                = list.stream().filter(odd).collect(
                Collectors.toList());

        System.out.println(oddNumbers);
    }
}
