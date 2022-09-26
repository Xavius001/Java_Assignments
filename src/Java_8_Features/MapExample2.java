package Java_8_Features;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapExample2 {
    public static void main(String[] args) {
        List<Employee> list= Arrays.asList(
                new Employee(1,"Thu", LocalDate.parse("2022-01-01"),40000),
                new Employee(2,"Ahn", LocalDate.parse("2022-03-01"),45000),
                new Employee(3,"Allaman", LocalDate.parse("2022-04-01"),50000),
                new Employee(4,"Xavier", LocalDate.parse("2022-05-01"),55000)
        );
        /*
        Function<Employee, Employee> F = new Function<Employee, Employee>() {
            @Override
            public Employee apply(Employee employee) {
                employee.setBasic(employee.getBasic()+employee.getBasic()*10/100);
                return employee;
            }
        };
         */
        Function<Employee, Employee> F = (T) -> {T.setBasic(T.getBasic()+T.getBasic()*10/100); return T;};
        list.stream().map(F).forEach(i -> System.out.println(i.getEmpno()+" "+i.getBasic()));
    }
}
