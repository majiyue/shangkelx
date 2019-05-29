package Testmjy;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Genericlx1 {

    public static void main(String[] args) {


        MyCollection<String> mc = new MyCollection<String>();

        mc.set("mjy",0);
        //mc.set(666,1);

       //Integer a = (Integer)mc.get(0);
        //String b = (String)mc.get(1);

        String b = mc.get(1);

        System.out.println(b);
        //System.out.println(a);

//        List list = new ArrayList();
//        Map map = new HashMap();
//
    }



}




class MyCollection<T>{
    Object[] objs = new Object[5];

    public void set(T t,int index){
        objs[index] = t;

    }

    public T get(int index){
        return (T)objs[index];
    }


}