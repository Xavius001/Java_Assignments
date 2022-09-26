package Java_8_Features;


import java.util.*;
import java.util.function.*;

public class ForEachExample {
    public static void main(String[] args) {
        /*List<Integer> list = new ArrayList<Integer>(); //dynamic
        list.add(10);
        list.add(30);
        list.add(40);*/

        List<Integer> list = Arrays.asList(10, 20, 30, 25, 50, 45, 60); //static

        /*for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for(Integer i : list) {
            System.out.println(i);
        }*/

        /*Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer T) {
                System.out.println(T);
            }
        };*/

        //consumer as anon class with lambda expression
        /*Consumer<Integer> C = (T) -> {
            System.out.println(T);
        };*/

        //Consumer<Integer> C = T -> System.out.println(T);

        //list.forEach(T -> System.out.println(T));

        //list.forEach(c); //using consumer interface

        list.forEach(i-> System.out.println(i)); //lamba expression
    }
}
