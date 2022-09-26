package Java_8_Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class reduceExample1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20,40,20,10,90,60);
        /*BinaryOperator<Integer> B = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer T, Integer R) {
                System.out.println(T+" "+R);
                return T+R;
            }
        };*/
        //T = T+R = 0+20



        Integer Tot = list.stream().filter(i->i>50).map(j->j*10).reduce(0,(T,R) -> T+R);
        System.out.println(Tot);
    }
}
