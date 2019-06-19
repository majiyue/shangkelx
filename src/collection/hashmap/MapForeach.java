package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapForeach {
    public static void main(String[] args) {
        Map<String,String > map = new HashMap();
        map.put("1","1");
        map.put(null,"2");
        map.put("mjy","3");
        map.put("4","4");

        for (String key:map.keySet()){
            System.out.println(key+":"+map.get(key));
        }
        System.out.println("----------------");
        for (Map.Entry<String ,String > entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


        //2
        System.out.println("-----------------");
        map.forEach((k,v)-> System.out.println(k+":"+v));

        //3迭代器
        Iterator<Map.Entry<String,String >> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String ,String > entry = iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }




    }
}
