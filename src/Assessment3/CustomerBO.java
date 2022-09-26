package Assessment3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerBO {
    private static List<Customer> CList = new ArrayList<Customer>();
    private static boolean Validate(Customer customer) {
        int count = 0;
        if(customer.getDateOfCreation().isBefore(LocalDate.now()) &&
        (customer.getCustomerType().equals("Premium") || customer.getCustomerType().equals("Guest"))
                && customer.getPermanentAddress().getZipcode().length()==5) {
                return true;
        }
        return false;
    }
    public static void AddCustomer(Customer customer) {
        if(Validate(customer)) CList.add(customer);
    }
    public static List<Customer>getCustomers() {
        CList = CList.stream().sorted((c1, c2) -> c1.getDateOfCreation().compareTo(c2.getDateOfCreation())).collect(Collectors.toList());
        return CList;
    }
}
