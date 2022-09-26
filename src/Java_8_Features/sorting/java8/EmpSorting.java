package Java_8_Features.sorting.java8;

import Java_8_Features.sorting.Employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpSorting {
    public static void main(String[] args) {
        List<Java_8_Features.sorting.Employee> list = Arrays.asList(
                new Java_8_Features.sorting.Employee(1, "Thu", LocalDate.parse("2022-01-01"), 60000),
                new Java_8_Features.sorting.Employee(2, "Anh", LocalDate.parse("2020-03-01"), 45000),
                new Java_8_Features.sorting.Employee(3, "Allaman", LocalDate.parse("2021-04-01"), 50000),
                new Employee(4, "Xavier", LocalDate.parse("2022-05-01"), 55000)
        );
        /*Comparator<Employee> C = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getBasic()-o2.getBasic());
            }
        };
         */

        //lambda expression
        /*Comparator<Employee> C = (o1,o2) ->{
            return (int) (o1.getBasic()-o2.getBasic());
        };*/

        //shorter lambda expression
        //Comparator<Employee> C = (o1,o2) -> (int) (o1.getBasic()-o2.getBasic());

        //lambda within sort method
        Collections.sort(list, (o1,o2) -> (int) (o1.getBasic()-o2.getBasic()));
        list.forEach(e -> System.out.println(e.getEmpno()+" "+e.getBasic()));

        Collections.sort(list, (o1,o2) ->o1.getEname().compareTo(o2.getEname()));
        list.forEach(e -> System.out.println(e.getEmpno()+" "+e.getEname()));

        Collections.sort(list, (o1,o2) ->o1.getDoj().compareTo(o2.getDoj()));
        list.forEach(e -> System.out.println(e.getEmpno()+" "+e.getEname()+" "+e.getDoj()));
    }
}
