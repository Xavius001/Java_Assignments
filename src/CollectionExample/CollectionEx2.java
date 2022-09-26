package CollectionExample;

import java.util.*;

public class CollectionEx2 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        Employee E = new Employee(1,"Smith",20000);
        list.add(E);
        E = new Employee(2,"Anh",60000);
        list.add(E);
        list.add(new Employee(3,"Martin",40000));
        list.add(new Employee(4,"Norah",15000));
        System.out.println("Original");
        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i).getEmpno()+" "+list.get(i).getEname()+" "+list.get(i).getBasic());
        }
        System.out.println();
        Collections.sort(list);
        System.out.println("Sorted");
        for(Employee e : list) {
            System.out.println(e.getEmpno()+" "+e.getEname()+" "+e.getBasic());
        }
    }
}
