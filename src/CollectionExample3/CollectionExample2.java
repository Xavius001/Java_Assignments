package CollectionExample3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CollectionExample2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        Employee E = new Employee(101, "A", 30000, LocalDate.parse("2019-02-09"));
        list.add(E);
        E = new Employee(102, "B", 50000, LocalDate.parse("2019-12-01"));
        list.add(E);
        E = new Employee(103, "C", 60000, LocalDate.parse("2019-10-01"));
        list.add(E);
        E = new Employee(104, "D", 70000, LocalDate.parse("2019-11-01"));
        list.add(E);
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getEmpno()+" "+list.get(i).getName()+" "+list.get(i).getBasic()+" "+list.get(i).getDoj());
        }
        //accessing objects directly and preferred in projects
        for(Employee e : list) {
            System.out.println(e.getEmpno()+" "+e.getName()+" "+e.getBasic()+" "+e.getDoj());
        }
        list.remove(2);
        System.out.println("After Removing");
        for(Employee e : list) {
            System.out.println(e.getEmpno()+" "+e.getName()+" "+e.getBasic()+" "+e.getDoj());
        }
    }
}
