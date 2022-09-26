package Java_8_Features.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example1Stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(40,20,10,60,70);
        list.forEach(i -> System.out.println(i));
        Stream<Integer> S = list.stream();

        /*Predicate<Integer> P = new Predicate<Integer>() {
            @Override
            public boolean test(Integer T) {
                return T>50;
            }
        };*/

        //shortened with lambda expression
        //Predicate<Integer> P = (i) -> {return i>50;};

        //shorter lambda expression
        //Predicate<Integer> P = (i) -> i>50;

        System.out.println("After filter");
        //S.filter(P).forEach(i -> System.out.println(i));
        list.stream().filter(i -> i>50 && i<65).forEach(i -> System.out.println(i));
    }

}
