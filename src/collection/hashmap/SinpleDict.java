package collection.hashmap;

import java.util.*;

public class SinpleDict {
    public static void main(String[] args) {
        Map<String , List<String>> dict = generateDictBook();
        loopdict(dict);

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("请输入要查询的单词：");
            String word = in.nextLine();
            find(dict, word);
        }

    }

    private static void find(Map<String ,List<String >> dict,String word){


        String first = word.substring(0, 1).toUpperCase();

        List<String > dic = dict.get(first);


        if(dic==null){
            return ;
        }
        boolean contains = dic.contains(word);

        if(contains==true){
            System.out.println("找到单词"+word);
        }
        else
            System.out.println("没有找到。");


    }



    private static void loopdict(Map<String, List<String>> dict) {
        Iterator<Map.Entry<String ,List<String>>> iDict =
                dict.entrySet().iterator();

        String strDict ="";
        while (iDict.hasNext()) {

            Map.Entry<String ,List<String>> entry = iDict.next();
            String key = entry.getKey();
            List<String > valueList = entry.getValue();
//            System.out.println(key);
//            System.out.println(valueList.toString());

            strDict = strDict+ "{" +  key + ":"+valueList.toString()+"}";
//
//            for (String word:valueList){
//                strDict= strDict+word+" ";
//            }



        }
        System.out.println(strDict);
    }

    private static Map<String , List<String>> generateDictBook() {
        Map<String , List<String>> dict  =new HashMap<>();

        List<String> listA = new ArrayList<>();
        listA.add("apple");
        listA.add("add");
        listA.add("about");
        dict.put("A",listA);


        List<String> listB = new ArrayList<>();
        listB.add("banana");
        listB.add("bat");
        listB.add("bike");
        listB.add("bite");
        dict.put("B",listB);


        List<String> listC = new ArrayList<>();
        listC.add("car");
        listC.add("circle");
        listC.add("carry");
        listC.add("cut");
        dict.put("C",listC);
        return dict;
    }
}
