package Java_8_Features.StreamAPI.Assignment;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class StreamAssignment {

    static String findAge(List<LocalDate> D) {

        //today's date
        LocalDate today = LocalDate.now();

        //sorts the LocalDate list in ascending order with anonymous class
        Collections.sort(D, new Comparator<LocalDate>() {
            @Override
            public int compare(LocalDate o1, LocalDate o2) {
                Period P1 = Period.between(o1, today); //finds the age of the first date
                Period P2 = Period.between(o2, today); //finds the age of the second date
                return P1.getYears()-P2.getYears();  //swaps both dates if the second date is greater than the first date
            }
        });
        final String[] ages = {""}; //string array since the stream api wouldn't let me add the age to a NORMAL string

        //checks if the age of a date is over 30 YO and adds it to the 1st index of a string array (1st index)
        D.stream().filter(i -> (Period.between(i, today)).getYears() > 30).forEach(j -> ages[0] = ages[0] + (Period.between(j, today)).getYears() +" ");
        if(ages[0].length()==0) ages[0] = "No one above 30"; //checks if the 1st index is empty
        return ages[0];
    }

    static String getUnmatched(List<String> list1, List<String> list2) {
        final String[] unMatched = {""}; //string array since the stream api wouldn't let me add the age to a NORMAL string

        //sees if list2 contains any elements in list1, if so it adds that element to the string array (1st index)
        list1.stream().filter(i -> !list2.contains(i)).forEach(j -> unMatched[0]+=j+" ");
        if(unMatched[0].length()==0) unMatched[0] = "None"; //checks if the 1st index is empty and sets it to none if empty
        return unMatched[0];
    }

    public static void main(String[] args) {
        //Question 1
        //List<LocalDate> D = new ArrayList<LocalDate>();
        /* //Sample 1
        D.add(LocalDate.parse("1987-09-01"));
        D.add(LocalDate.parse("1989-11-11"));
        D.add(LocalDate.parse("1990-04-12"));
        D.add(LocalDate.parse("1991-03-15"));
        D.add(LocalDate.parse("1992-01-21"));
        D.add(LocalDate.parse("1993-10-01"));
        D.add(LocalDate.parse("1998-12-21"));
        D.add(LocalDate.parse("1975-06-24"));
        D.add(LocalDate.parse("1969-01-20"));
        D.add(LocalDate.parse("1976-08-08"));
        */
        /* //Sample 2
        for(int i = 0; i < 10; i++) {
            D.add(LocalDate.parse("1998-12-21"));
        }
        */
        //System.out.println(findAge(D));

        //Question 2
        /*
        List<Employee> E = Arrays.asList(
                new Employee(1, "Thu", LocalDate.parse("2022-01-01"), 60000),
                new Employee(2, "Anh", LocalDate.parse("2022-03-01"), 45000),
                new Employee(3, "Allaman", LocalDate.parse("2022-04-01"), 50000),
                new Employee(4, "Xavier", LocalDate.parse("2022-01-24"), 55000)
        );
        //sees if the month of date is January and prints out the corresponding name and date
        E.stream().filter(i -> i.getDoj().getMonthValue()==1).forEach(j -> System.out.println(j.getEname()+" "+j.getDoj()));
         */

        //Question 3
        /*
        //sample 1
        List<String> list1 = Arrays.asList("one","two","three","four");
        List<String> list2 = Arrays.asList("one","five","three","four");
        System.out.println(getUnmatched(list1, list2)); //sees if list1 has any items present in list 2

        //sample 2
        list1 = Arrays.asList("one","two","three","four");
        list2 = Arrays.asList("one","two","three","four");
        System.out.println(getUnmatched(list1, list2)); //sees if list1 has any items present in list 2
         */
    }
}
