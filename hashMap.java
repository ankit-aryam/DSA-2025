import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 220);
        hm.put("Paxtan", 40);

        System.out.println(hm);

        System.out.println(hm.containsKey("Paxtan"));
        System.out.println(hm.containsKey("China"));

        System.out.println(hm.get("India"));

        Set<String> keys = hm.keySet();

        for(String key: hm.keySet()){
            System.out.println(hm.get(key));
        }






    }
}
