package CollectionExample2;

import CollectionExample2.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class MultipleSorts {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        Employee E = new Employee(1,"Smith",20000);
        list.add(E);
        E = new Employee(2,"Anh",60000);
        list.add(E);
        list.add(new Employee(3,"Martin",40000));
        list.add(new Employee(4,"Norah",15000));

        System.out.println("Original");
        for(Employee e : list) {
            System.out.println(e.getEmpno()+" "+e.getEname()+" "+e.getBasic());
        }
        System.out.println();

        Collections.sort(list, new BasicComparator());
        System.out.println("Sorted By Basic");
        for(Employee e : list) {
            System.out.println(e.getEmpno()+" "+e.getEname()+" "+e.getBasic());
        }
        System.out.println();

        Collections.sort(list, new NameCaparator());
        System.out.println("Sorted By Name");
        for(Employee e : list) {
            System.out.println(e.getEmpno()+" "+e.getEname()+" "+e.getBasic());
        }
        System.out.println();

        Collections.sort(list, new NumberCaparator());
        System.out.println("Sorted By Number");
        for(Employee e : list) {
            System.out.println(e.getEmpno()+" "+e.getEname()+" "+e.getBasic());
        }
    }

}
