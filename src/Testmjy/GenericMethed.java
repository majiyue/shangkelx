package Testmjy;

public class GenericMethed {

    private static<T> boolean isEqual(GenericClass<T> g1,GenericClass<T> g2 ){
     //return g1.getItem().equals(g2.getItem());

     return g1.getItem() == g2.getItem();

    }

    private static <T extends Comparable<T>> int compared(T t1, T t2){
        return t1.compareTo(t2);

    }


    public static void main(String[] args) {
        GenericClass<String> g1 = new GenericClass<>();
        g1.setItem("xian");


        GenericClass<String> g2 = new GenericClass<>();
        g2.setItem("xian");

        boolean isEqual = isEqual(g1,g2);
        System.out.println(isEqual);



        System.out.println(compared(2,8));


    }



}
