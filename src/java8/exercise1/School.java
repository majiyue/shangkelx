package java8.exercise1;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class School {

    private static List<Student> register() {

        Student s1 =new Student(1l,"GuoMan",Student.Gender.FEMALE,800, LocalDate.of(1999, Month.FEBRUARY,10),Student.Department.CN);
        Student s2 =new Student(2l,"LiuHaoyu",Student.Gender.MALE,80, LocalDate.of(2000, Month.AUGUST,9),Student.Department.CL);
        Student s3 =new Student(3l,"LiJie",Student.Gender.MALE,300, LocalDate.of(1998, Month.JULY,2),Student.Department.AM);
        Student s4 =new Student(4l,"YangChaoYang",Student.Gender.MALE,260, LocalDate.of(2000, Month.JUNE,1),Student.Department.EE);
        Student s5 =new Student(5l,"Yuanxinyi",Student.Gender.FEMALE,500, LocalDate.of(2000, Month.FEBRUARY,5),Student.Department.EL);
        Student s6 =new Student(6l,"Majiyue",Student.Gender.MALE,200, LocalDate.of(1998, Month.SEPTEMBER,3),Student.Department.CL);
        Student s7 =new Student(7l,"ZhangXiaoLong",Student.Gender.MALE,400, LocalDate.of(2000, Month.DECEMBER,6),Student.Department.AM);
        Student s8 =new Student(8l,"XiongXinYi",Student.Gender.FEMALE,600, LocalDate.of(2000, Month.MARCH,12),Student.Department.EL);
        Student s9 =new Student(9l,"YuanXinyi",Student.Gender.FEMALE,700, LocalDate.of(2000, Month.JULY,3),Student.Department.CS);
        Student s10 =new Student(10l,"XiaoMing",Student.Gender.MALE,120, LocalDate.of(1999, Month.MAY,5),Student.Department.CS);
        Student s11 =new Student(11l,"ZhangJiaWei",Student.Gender.MALE,300, LocalDate.of(2000, Month.JUNE,10),Student.Department.CN);
        Student s12 = new Student(12l, "XiaoRuoWen", Student.Gender.FEMALE, 900, LocalDate.of(2000, Month.DECEMBER, 9), Student.Department.EE);
        return Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
    }


    private static void log(String prfix, Object content) {
        System.out.println(prfix + content);
    }


    public static void main(String[] args) {

        List<Student> students = register();
//        log("", students);

        //total number
        long studentCount = students.stream().mapToLong(s -> 1l).sum();
        log("Total of student is :", studentCount);

        //total credit
        long totalCredits = students.stream().mapToLong(Student::getCredit).sum();
        log("Total credits is :", totalCredits);


                Map<Student.Gender, Long> groupCountByGender = students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getGender, Collectors.counting()));
        log("Student total by gender is :", groupCountByGender);



        //Max credit
        Optional<Student> maxCredit = students.stream()
                .max(Comparator.comparingInt(Student::getCredit));
        maxCredit.ifPresent(student -> log("Max credit is :", student.getName()));


        boolean allMale = students.stream().allMatch(Student::isMale);
        log("If all students male? ", allMale);


        LongSummaryStatistics statistics = students.stream()
                .map(Student::getCredit)
                .collect(LongSummaryStatistics::new,
                        LongSummaryStatistics::accept,
                        LongSummaryStatistics::combine);
        log("Stats: ", statistics);



        Double creditAvg = students.stream()
                .collect(Collectors.averagingDouble(Student::getCredit));
        log("Stats average ", creditAvg);


        Map<String, Integer> studentMap = students.stream()
                .collect(Collectors.toMap(Student::getName, Student::getCredit));
        log("Students with credit: ",studentMap);


        String names = students.stream()
                .filter(Student::isFemale)
                .map(Student::getName)
                .collect(Collectors.joining(",","Contratulation! "," Welcome join us!"));

        log("", names);


    }
}
