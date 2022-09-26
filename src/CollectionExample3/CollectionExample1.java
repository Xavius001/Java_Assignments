package CollectionExample3;

import java.util.*;

public class CollectionExample1 {
    public static void main(String[] args) {
        /*
        //Object a = "hello"; //not typesafe
        int a = 1000; //typesafe --> restricted
        int b = a / 20;
        System.out.println(b);
        */

        /* Non-generic List
        ArrayList A = new ArrayList();
        A.add(10);
        A.add("Hello");
        */


        /*ArrayList<String> A = new ArrayList<String>();
        A.add("Hel");
        A.add("Hello");
        A.add("All");

         */

        List<Integer> A1 = new ArrayList<Integer>();
        A1.add(10);
        A1.add(200);
        A1.add(300);
        A1.add(400);
        /*
        for(int i = 0; i < A1.size(); i++) {
            System.out.println(A1.get(i));
        }
        for(Integer I : A1) {
            System.out.println(I);
        }
         */
        Iterator<Integer> I = A1.iterator();
        while(I.hasNext()) {
            System.out.println(I.next());
        }

    }
}
