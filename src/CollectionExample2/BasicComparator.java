package CollectionExample2;

import java.util.Comparator;

public class BasicComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getBasic() > o2.getBasic()) return 1;
        else if (o1.getBasic() < o2.getBasic()) return -1;
        else return 0;
    }
}
