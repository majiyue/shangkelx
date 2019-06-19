package collection.arraylist;


import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;

import java.util.List;

public class ListSort {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("mjy1",20));
        students.add(new Student("mjy12",22));
        students.add(new Student("mjy13",20));
        students.add(new Student("mjy14",40));
        students.add(new Student("mjy15",60));
        students.add(new Student("mjy16",90));
        students.add(new Student("mjy17",60));
        students.add(new Student("mjy18",20));

        System.out.println(students);

        students.sort((o1, o2) -> o2.getAge() - o1.getAge());
        System.out.println(students);



    }
}
