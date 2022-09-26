package CollectionExample2;

import java.util.Comparator;

public class NameCaparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        if (o1.getEname().compareTo(o2.getEname())>0) return 1;
        else if (o1.getEname().compareTo(o2.getEname())<0) return -1;
        else return 0;
    }
}