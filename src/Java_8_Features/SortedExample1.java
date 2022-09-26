package Java_8_Features;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample1 {
    public static void main(String[] args) {
        List<Employee> list= Arrays.asList(
                new Employee(1,"Thu", LocalDate.parse("2022-01-01"),40000),
                new Employee(2,"Ahn", LocalDate.parse("2022-03-01"),45000),
                new Employee(3,"Allaman", LocalDate.parse("2022-04-01"),50000),
                new Employee(4,"Xavier", LocalDate.parse("2022-05-01"),55000)
        );
        Comparator<Employee> C = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getBasic()-o2.getBasic());
            }
        };
        list.stream().sorted((o1, o2) -> (int) (o1.getBasic()-o2.getBasic())).forEach(i -> System.out.println(i.getEmpno()+" "+i.getBasic()));
    }
}
