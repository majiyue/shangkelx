package collection.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListForeach {
    public static void main(String[] args) {

        List<String> stacks = new ArrayList<>();
        stacks.add("Google");
        stacks.add("Apple");
        stacks.add("Mic");
        stacks.add("Facebook");

//        Consumer<Object> consumer  = new ListForeach().new Myconsumer();


//        stacks.forEach(consumer);

        stacks.forEach(System.out::println);


    }



//    class Myconsumer implements Consumer<Object> {
//
//
//        @Override
//        public void accept(Object o) {
//            System.out.println(o);
//        }
//    }






}
