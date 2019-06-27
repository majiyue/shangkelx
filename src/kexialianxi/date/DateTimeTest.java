package kexialianxi.date;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeTest {


    @Test
    public void testSimpDateFormat() {

        SimpleDateFormat sdf = new SimpleDateFormat();

        Date date = new Date();

        System.out.println(date);

        String s1 = sdf.format(date);
        System.out.println(s1);


        String str = "6/21/19, 7:00 PM";
        try {
            Date date1 = sdf.parse(str);
            System.out.println(date1);

        } catch (ParseException e) {
            e.printStackTrace();
        }


        System.out.println("............................");

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MMMM.dd GGG hh:mm aaa");

        String format1 = sdf1.format(date);
        System.out.println(format1);


        try {
            Date data2 = sdf1.parse("2019.June.21 AD 07:05 PM");
            System.out.println(data2);
        } catch (ParseException e) {
            e.printStackTrace();


        }
    }
    /*
    练习一：字符串"2020-09-08"转换为java.sql.Date

     */

    @Test
    public void testExer() {
        String birth = "2019-08-05";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf1.parse(birth);
            //System.out.println(date);

            java.sql.Date birthDate = new java.sql.Date(date.getTime());
            System.out.println(birth);
        } catch (ParseException e) {
            e.printStackTrace();
        }



        /*
        练习二："三天打鱼两天晒网" 1990-01-01   xxxx-xx-xx  打🐟？晒网？

        eg: 2020-09-09?
        总天数％5 ＝＝ 1，2，3  打鱼
        总天数％5 ＝＝ 4，0     晒网

        总天数的计算？
        1.毫秒数   (date2.getTime() - date1.getTime())   /(1000*60*60*24)+1


         */


    }

    @Test
    public void ChakanYufu() throws ParseException {
        String d1 = "1990-01-01";
        String d2 = "2020-09-18";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

        Date date1 = sdf1.parse(d1);
        Date date2 = sdf1.parse(d2);

        int CountDay = (int) ((date2.getTime() - date1.getTime())/(1000*60*60*24)+1);

        int day =CountDay%5;

        System.out.println(day);
        if ( day == 1 || day == 2 || day == 3 ) {
            System.out.println("打渔"+day);
        } else if ( day == 0 || day == 4 ) {
            System.out.println("晒网"+day);
        }

    }


    @Test
    public void testCalender(){
        /*
        方式一：创建其子类（GregorianCalender）的对象
        方式二：调用其静态方法getInstance()
         */

        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getClass());


        //常用方法：1.get()        获取日期
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        //set()      修改日期
        calendar.set(Calendar.DAY_OF_MONTH,22);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);


        //add()       增加日期
        calendar.add(Calendar.DAY_OF_MONTH, 3);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);


        //getTime()   ------->Date
        Date date = calendar.getTime();
        System.out.println(date);

        //setTime()
        Date date1 = new Date();
        calendar.setTime(date1);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);




    }




}
