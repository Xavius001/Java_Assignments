package Java_8_Features;

import java.time.LocalDate;
import java.util.*;

public class EmpExampleForeach {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList (
                new Employee(1, "Thu", LocalDate.parse("2022-01-01"), 4000),
                new Employee(2, "Anh", LocalDate.parse("2022-03-01"), 4500),
                new Employee(3, "Allaman", LocalDate.parse("2022-04-01"), 5000),
                new Employee(4, "Xavier", LocalDate.parse("2022-05-01"), 5500)
        );

        List<Employee> list1 = new ArrayList<Employee>();
        Employee E = new Employee(1, "Thu", LocalDate.parse("2022-01-01"), 4000);
        list1.add(E);
        E = new Employee(2, "Anh", LocalDate.parse("2022-03-01"), 4500);
        list1.add(E);
        E = new Employee(3, "Allaman", LocalDate.parse("2022-04-01"), 5000);
        list1.add(E);
        E = new Employee(4, "Xavier", LocalDate.parse("2022-05-01"), 5500);
        list1.add(E);

        list.forEach(i -> System.out.println(i.getEmpno()+" "+i.getEname()+" "+i.getDoj()+" "+i.getBasic()));
    }
}
