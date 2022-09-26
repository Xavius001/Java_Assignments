package CollectionExample3;

import java.util.*;

public class CollectionExample3 {
    public static void main(String[] args) {
        HashSet<Integer> H = new HashSet<Integer>(); //cannot access by index
        H.add(10);
        H.add(20);
        H.add(15);
        H.add(null);
        H.add(15); //does not accept duplicate values
        H.add(25);
        H.add(null);
        System.out.println("HashSet");
        for(Integer i: H) {
            //prints out numbers randomly
            System.out.print(i+" ");
        }
        System.out.println("\n");
        List<Integer> L = new ArrayList<Integer>(); //can access by index
        L.add(10);
        L.add(20);
        L.add(15);
        L.add(15); //does not accept duplicate values
        L.add(null);
        L.add(null);
        L.add(25);
        System.out.println("ArrayList");
        for(Integer i: L) {
            //prints out the integers in order you entered them
            System.out.print(i+" ");
        }
        System.out.println("\n");
        SortedSet<Integer> S = new TreeSet<Integer>(); //sorted set is interface, cannot be accessed by index
        System.out.println("TreeSet");
        try {
            S.add(10);
            S.add(20);
            S.add(15);
            S.add(15); //does not accept duplicate values
            S.add(null);
            S.add(null);
            S.add(25);
        }
        catch(NullPointerException E) {
            System.out.println("Cannot accept null");
        }
        for(Integer i: S) {
            //prints out numbers in ascending order
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Stack");
        Stack<Integer> St = new Stack<Integer>();
        St.push(10);
        St.push(20);
        St.push(30);
        System.out.println(St.pop());
        System.out.println(St.pop());
    }
}
