package collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class BasicList {
    public static void main(String[] args) {

        List<String> arrlist = new ArrayList<>();

        arrlist.add("a");
        arrlist.add("i");
        arrlist.add(1,"e");

        System.out.println(arrlist);


        List<String> arrlist1 = new ArrayList<>();

        arrlist1.add("o");
        arrlist1.add("u");
        arrlist.addAll(arrlist1);

        System.out.println(arrlist);

        arrlist1.clear();

        System.out.println(arrlist1);



        arrlist.set(0,"e");
        System.out.println(arrlist);


        arrlist1 = arrlist.subList(0,2);
        System.out.println(arrlist1);



    }

}
