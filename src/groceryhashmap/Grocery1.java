package groceryhashmap;

import java.util.*;

public class Grocery1 {

    Map<Integer, String> grocery = new HashMap<>();

    public Grocery1() {
        System.out.println("you have " + grocery.size() + " items currently");
        for (Object key : grocery.keySet()) {
            System.out.println(grocery.get(key));
        }

    }

    public void addItem(Integer key, String item) {
        grocery.put(key, item);
        System.out.println(item + " add");
    }

    public void delItemkey(Integer key) {

        String r = grocery.get(key);
        grocery.remove(key);
        System.out.println(r + " delete");
    }

    public void delItemvalue(String value) {
        int flag = 0;

        List al = new ArrayList();

        for (Integer key : grocery.keySet()) {

            if ( (grocery.get(key)).equals(value) ) {
                flag = 1;
                al.add(key);
                // grocery.remove(key);  在迭代器里面修改，会出现并发异常！！！！！！！！！！！！
            }
        }
        if ( flag == 1 ) {
            for (int i=0;i<al.size();i++) {
                String d = grocery.get(al.get(i));
                grocery.remove(al.get(i));
                System.out.println( d+" has been delete");
            }
        }
        else
            System.out.println("no delete");


    }

    public void modifyItemKey(Integer key, String value) {

        for (Integer id : grocery.keySet()) {

            if ( id.equals(key) ) {
                grocery.replace(id,value);
                System.out.println(grocery.get(id) + " has been modify!");
            }


            }
        }


        public void modifyItemValue(String value){
        for (Integer id:grocery.keySet()){
            if(grocery.get(id).equals(value) ){
                Scanner in = new Scanner(System.in);
                System.out.println("请输入新的名称");
                String newName = in.nextLine();
                grocery.replace(id,newName);

                System.out.println(grocery.get(id)+" has been modify");

            }
        }
        }


    public String find(String value) {
        int flag = 0;
        for (Integer key : grocery.keySet()) {
            if ( grocery.get(key).equals(value) ) {
                System.out.println(grocery.get(key) + " has find");
                flag = 1;
            }
        }
        if ( flag == 0 ) {

            return " no find item!";
        }
        return "";
    }

    public String find(Integer key) {
        int flag = 0;
        for (Integer keys : grocery.keySet()) {
            if ( key.equals(keys) ) {
                System.out.println(grocery.get(key) + " has find");
                flag = 1;
            } else
                continue;
        }
        if ( flag == 0 ) {

            return " has not find";
        }
        return "";
    }

    public int total() {
        return grocery.size();
    }


    @Override
    public String toString() {
        return "Grocery1{" +
                "grocery=" + grocery +
                '}';
    }
}