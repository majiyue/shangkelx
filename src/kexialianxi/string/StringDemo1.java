package kexialianxi.string;

import org.junit.Test;

import java.lang.management.ManagementFactory;

public class StringDemo1 {
    public int getCount(String mainStr, String subStr) {
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index =0;

        if ( mainLength >= subLength ) {



//            while ( (index = mainStr.indexOf(subStr)) != -1 ) {
//
//            count++;
//
//            mainStr = mainStr.substring(index + subStr.length());
//            }

            while ((index = mainStr.indexOf(subStr, 0)) != -1) {
                count++;
                index += subLength;
            }

            return count;
        }else
            return 0;
    }


    @Test
    public void testGetCount(){
        String mainStr = "abkkcadaabababababbabababasjkab";
        String subStr = "ab";
        int count = getCount(mainStr, subStr);
        System.out.println(count);


    }
}
