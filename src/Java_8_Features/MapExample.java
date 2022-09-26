package Java_8_Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(40,20,10,45,30,47);
        /*
        Function<Integer, Integer> F = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer T) {
                return T*2;
            }
        };
         */

        Function<Integer, Integer> F = T -> (T*3);

        //list.stream().map(F).forEach(i -> System.out.println(i));
        List<Integer> L = list.stream().map(F).collect(Collectors.toList());
        L.forEach(i -> System.out.println(i));
    }
}
