package Testmjy;

import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String sentence = "hellow hi HI MJY mjy MJY 111";
        String[] words = sentence.split(" ");

        wordprint(words);

        Integer num[] = {1,2,3,4,5,4,4,4,4,4,56,78};
        wordprint(num);

    }

    private static <T>void wordprint(T array[]) {
        HashMap<T,Integer> map = wordCount(array);
        System.out.println(map);
    }





    private static <T>HashMap<T,Integer> wordCount(T group[]){
        HashMap<T,Integer> map = new HashMap<>();

        for (T member:group){

            if ( map.get(member) == null ){
                map.put(member,1);
            }else {
                map.put(member,map.get(member) + 1);
            }

        }
        return map;
    }

}
