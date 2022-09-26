package Java_8_Features.sorting;

import java.util.Comparator;

public class NameSorting implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.getEname().compareTo(o2.getEname());
    }
}
