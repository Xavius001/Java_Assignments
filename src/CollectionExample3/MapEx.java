package CollectionExample3;

import java.util.*;

public class MapEx {
    public static void main(String[] args) {
        Map<String,Integer> M = new HashMap<String,Integer>();
        M.put("XXX", 543543543);
        M.put("ABC", 434434435);
        M.put("XYZ", 543543543);
        M.put("AAA", 343343348);
        M.put("AAA", 343343349); //does not accept duplicate keys
        System.out.println(M.get("AAA"));

        Set set = M.entrySet();
        Iterator I = set.iterator(); //interface
        while(I.hasNext()) {
            Map.Entry entry = (Map.Entry) I.next(); //cast map entry to interface
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
