package Java_8_Features.sorting;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingEx1 {
    public static void main(String[] args) {
        List<Employee>list = Arrays.asList(
                new Employee(1, "Thu", LocalDate.parse("2022-01-01"), 60000),
                new Employee(2, "Anh", LocalDate.parse("2022-03-01"), 45000),
                new Employee(3, "Allaman", LocalDate.parse("2022-04-01"), 50000),
                new Employee(4, "Xavier", LocalDate.parse("2022-05-01"), 55000)
        );

        List<Employee2>list2 = Arrays.asList(
                new Employee2(1, "Thu", LocalDate.parse("2022-01-01"), 60000),
                new Employee2(2, "Anh", LocalDate.parse("2022-03-01"), 45000),
                new Employee2(3, "Allaman", LocalDate.parse("2022-04-01"), 50000),
                new Employee2(4, "Xavier", LocalDate.parse("2022-05-01"), 55000)
        );

        Collections.sort(list2, new BasicSort());
        System.out.println("By Basic");
        list2.forEach(e -> System.out.println(e.getEname()+" "+e.getBasic()));
        Collections.sort(list2, new NameSorting());
        System.out.println("By Name");
        list2.forEach(e -> System.out.println(e.getEname()+" "+e.getBasic()));
    }
}
