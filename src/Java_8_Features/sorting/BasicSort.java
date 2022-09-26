package Java_8_Features.sorting;

import java.util.Comparator;

public class BasicSort implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        if(o1.getBasic()>o2.getBasic()) return 1;
        else if(o1.getBasic()<o2.getBasic()) return -1;
        else return 0;
    }
}
