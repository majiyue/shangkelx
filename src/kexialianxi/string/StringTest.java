package kexialianxi.string;

import org.junit.Test;

public class StringTest {

    @Test
    public void test4(){
        String s1 = new String("mjyaaa");

        StringBuilder s2 = new StringBuilder(s1);

        System.out.println(s2.reverse());


    }




    @Test
    public void test3(){
        String s1 = "mjy";
        String s2 = "aaa";

        String s7 = "mjyaaa";

        String s3 = "mjy" + "aaa";
        String s4 = "mjy" + s2;
         String s5 = s2 + "aaa";
        String s6 = s1 + s2;



        System.out.println(s3 == s7);  //true
        System.out.println(s3 == s4);  //false
        System.out.println(s3 == s5);   //false
        System.out.println(s3 == s6);   //false
        System.out.println(s4 == s5);   //false
        System.out.println(s4 == s6);   //false
    }







    @Test
    public void test2() {

        String s1 = "mjy";
        String s2 = "mjy";

        String s3 = new String("mjy");
        String s4 = new String("mjy");

        System.out.println(s1 == s2);   //true
        System.out.println(s1 == s3);   //false
        System.out.println(s1 == s4);   //false
        System.out.println(s3 == s4);   //false

        System.out.println("--------------------------");

        Student student1 = new Student("mjy", 21);
        Student student2 = new Student("mjy", 21);
        System.out.println(student1.name == student2.name);   //true
        System.out.println(student1 == student2);             //false
        System.out.println(student1.age == student2.age);     //true

        student1.name = "mjyaa";
        System.out.println(student2.name);

    }


    @Test
    public void test1() {

        String s1 = "abc";
        String s2 = "abc";

        s1 = "hello";

        System.out.println(s1);      //hello
        System.out.println(s2);      //abc

        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);
    }
}
