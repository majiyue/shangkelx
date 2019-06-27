package kexialianxi.string;

public class StringTestMianShi {
    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't'};

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';

    }

    public static void main(String[] args) {
        StringTestMianShi s1 = new StringTestMianShi();

        s1.change(s1.str, s1.ch);
        System.out.println(s1.str);   //good
        System.out.println(s1.ch);    //best

    }


}
