package Testmjy;

import java.sql.SQLOutput;
import java.text.DateFormat;

public interface GenericInheritance {



    public static void main(String[] args) {
        String str = "abcd";
        Object obj;
        obj = str;

        Object obj2 = "abcd";
        System.out.println(obj);

        System.out.println(obj2);

        MyClass<String> myClass1 = new MyClass<>();
        MyClass<Object> myClass2 = new MyClass<>();
        //myClass2 = myClass1;                 //类型不一致，不能赋值。

        obj2 = myClass1;
        System.out.println(obj2);

    }


    public static class MyClass<T>{

    }

}
