package kexialianxi.string;

import org.junit.Test;

public class StringDemo2 {
    /*
    获取两个字符串中最大相同的子串

     */

    public String getMaxSameString(String str1, String str2) {


        if ( str1 != null && str2 != null ) {

            String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String minStr = (str1.length() < str2.length()) ? str1 : str2;
            int length = minStr.length();

            for (int i = 0; i < length; i++) {


                for (int x = 0, y = length - i; y <= length; x++, y++) {

                    String substr = minStr.substring(x, y);


                    if ( maxStr.contains(substr) ) {
                        return substr;
                    }
                }

            }
        }

        return null;
    }

    @Test
    public void testGetMaxSameSting() {
        String str1 = "abcwerthelloyuiodefabcdef";
        String str2 = "cvhellonm";
        String maxSameString = getMaxSameString(str1, str2);

        System.out.println(maxSameString);

    }

}

