package collection.hashmap;

import java.util.*;
import java.util.Set;

public class MapBasic {
    public static void main(String[] args) {
        Map<String,String > data = new HashMap<>();

        data.put("A","A1");
        data.put("B","B1");
        data.put("C","C1");
        data.put("D","D1");
        data.put(null,"E");


        System.out.println(data);

        String b = data.get("B");
        //String b = data.getOrDefault("X","security");
        System.out.println(b);

        boolean isExist = data.containsKey("X");
        System.out.println(isExist);

        Set<Map.Entry<String ,String >> entrySet = data.entrySet();
        System.out.println(entrySet);
        System.out.println(entrySet.size());



        Map<String ,String > back = new HashMap<>(data);
        back.putAll(data);
        System.out.println(back);

        String nullValue = data.remove(null);
        System.out.println(data);
        System.out.println(nullValue);

        Set<String > keySet = data.keySet();//键值唯一，用Set
        System.out.println(keySet);


        Collection<String> valueSet = data.values();
        System.out.println(valueSet);




    }
}
