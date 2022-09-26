package CollectionExample;

import java.util.*;

public class CollectionEx1 {
    public static void main(String[] args) {
        //Non generic collection
        ArrayList A = new ArrayList();
        A.add(10);
        A.add("Hello");
        A.add(true);
        A.add(10.5);
        for(int i = 0; i < A.size(); i++) {
            System.out.println(A.get(i));
        }
        //generic collection
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        A1.add(10);
        A1.add(20);
        A1.add(80);
        A1.add(100);
        for(int i = 0; i < A1.size(); i++) {
            System.out.println(A1.get(i));
        }
        /*for(Integer i :A1) { alternate for loop^^^^
            System.out.println(i);
        }*/
        /*for(Object i :A1) { alternate for loop^^^^
            System.out.println(i);
        }*/

        A1.remove(1);
        for(int i = 0; i < A1.size(); i++) {
            System.out.println(A1.get(i));
        }
        Collections.sort(A1);
        for(int i = 0; i < A1.size(); i++) {
            System.out.println(A1.get(i));
        }
    }
}
