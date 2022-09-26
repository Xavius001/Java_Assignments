package Java_8_Features.StreamAPI;

import Java_8_Features.sorting.Employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        List<Java_8_Features.sorting.Employee> list = Arrays.asList(
                new Java_8_Features.sorting.Employee(1, "Thu", LocalDate.parse("2022-01-01"), 60000),
                new Java_8_Features.sorting.Employee(2, "Anh", LocalDate.parse("2022-03-01"), 45000),
                new Java_8_Features.sorting.Employee(3, "Allaman", LocalDate.parse("2022-04-01"), 50000),
                new Employee(4, "Xavier", LocalDate.parse("2022-05-01"), 55000)
        );
        //list.stream().filter(i -> i.getBasic()>50000).forEach(j -> System.out.println(j.getEmpno()+" "+j.getEname()));
        //list.stream().filter(i -> i.getEname().startsWith("A")).forEach(j -> System.out.println(j.getEmpno()+" "+j.getEname()));


        List<Employee> l = list.stream().filter(i -> i.getBasic()>50000).collect(Collectors.toList());

        //for(Employee e : l) System.out.println(e.getEmpno()+" "+e.getEname());
        l.forEach(i -> System.out.println(i.getEmpno()+" "+i.getEname()));
    }
}
