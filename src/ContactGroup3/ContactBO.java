package ContactGroup3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContactBO {
    public List<Contact> FindContact (List<Contact> contactList, List<String> name) {
        List<Contact> nameList = new ArrayList<Contact>();
        contactList.stream().filter(i -> name.stream().anyMatch(i.getName()::equalsIgnoreCase)).forEach(j -> nameList.add(j));
        return nameList;
    }

    public List<Contact> FindContact (List<Contact> contactList, LocalDate dateCreated) {
        List<Contact> dateList = new ArrayList<Contact>();
        contactList.stream().filter(i -> i.getDateCreated().equals(dateCreated)).forEach(j -> dateList.add(j));
        return dateList;
    }

    public List<Contact> FindContact (List<Contact> contactList, String domain) {
        List<Contact> domList = new ArrayList<Contact>();
        //contactList.stream().filter(i -> i.getEmail().contains(domain)).forEach(j -> domList.add(j));
        contactList.stream().filter(i -> i.getEmail().split("@")[1].equalsIgnoreCase(domain)).forEach(j -> domList.add(j));
        return domList;
    }

}
