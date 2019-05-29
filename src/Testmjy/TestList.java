package Testmjy;

import javax.sound.midi.Soundbank;
import java.util.*;
/*
测试Collection接口中的方法
 */
public class TestList {
    public static void main(String[] args) {

        //test2();

        test3();


    }

    public static void test1() {
        Collection<String> con = new ArrayList<>();

        con.add("mjy");
        con.add("mjy11");

        System.out.println(con);
        System.out.println(con.size());
        System.out.println(con.isEmpty());

        Object[] obj = con.toArray();
        System.out.println(obj);

        System.out.println(con.contains("mjy"));
        System.out.println(con.contains("mjy22"));



        con.remove("mjy");//只是将地址删除，mjy依然在。
        System.out.println(con);

        con.clear();
        System.out.println(con);
    }

    public static void test2() {
        List<String> list1 = new ArrayList<>();
        list1.add("mm");
        list1.add("jj");
        list1.add("yy");



        List<String> list2 = new ArrayList<>();
        list2.add("mm");
        list2.add("j2");
        list2.add("y2");

        System.out.println("list1"+list1);

        //list1.addAll(list2);
        //list1.removeAll(list2);    //去掉相同部分

        //list1.retainAll(list2);    //去掉不同部分



        System.out.println("lsit1"+list1);

        System.out.println(list1.containsAll(list2));

    }   //Collection中的方法

    public static void test3(){
        List<String > list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);

        list.add(2,"Fmjy");//指定位置加入元素
        System.out.println(list);



        list.remove(2);           //删出指定位置元素
        System.out.println(list);


        list.set(2,"Fmjy");
        System.out.println(list);       //置换指定位置元素

        System.out.println(list.get(2));   //get   直接返回指定位置元素



        list.add("D");
        list.add("C");
        list.add("B");
        list.add("A");
        System.out.println(list);

        System.out.println(list.indexOf("D"));  //返回元素第一次出现的位置。


        System.out.println(list.lastIndexOf("B"));  //返回元素最后一次出现的位置

    }   //索引的方法

}
