package kexialianxi.string;

/*

将一个字符串进行反转，将字符串中指定部分进行反转，比如"ABCDEFG"反转为"ABFEDCG"



 */


import org.junit.Test;

/*
方法一：转化为char[]
 */
public class StringDemo {
    public String reverse(String str, int startIndex, int endIndex) {
        if ( str != null ) {
            char[] arr = str.toCharArray();

            for (int i = startIndex, j = endIndex; i < j; i++, j--) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            return new String(arr);


        }
        return null;
    }


    /*
    方法二：使用 string拼接
     */
    public String reverse1(String str, int startIndex, int endIndex) {
        if ( str != null ) {
            String reverseStr = str.substring(0, startIndex);
            for (int i = endIndex; i >= startIndex; i--) {
                reverseStr += str.charAt(i);

            }
            reverseStr += str.substring(endIndex + 1);
            return reverseStr;
        }
        return null;
    }


    /*
    方式三：使用stingBuffer/StringBuildr替换Sting

     */
    public String reverse2(String str, int startIndex, int endIndex) {

        if ( str != null ) {
            StringBuilder builder = new StringBuilder(str.length());

            builder.append(str.substring(0, startIndex));
            for (int i = endIndex; i >= startIndex; i--) {
                builder.append(str.charAt(i));

            }
            builder.append(str.substring(endIndex + 1));

            return builder.toString();


        }
        return null;
    }

    @Test
    public void testReverse2() {
        String str = "mjyabcdef";
        String s1 = reverse1(str, 2, 5);
        System.out.println("testReverse2  " + s1);

    }
    @Test
    public void testReverse1() {
        String str = "mjyabcdef";
        String s1 = reverse1(str, 2, 5);
        System.out.println("testReverse1  " + s1);

    }


    @Test
    public void testReverse() {
        String str = "mjyabcdef";
        String s1 = reverse(str, 2, 5);
        System.out.println("testReverse  " + s1);
    }

}



