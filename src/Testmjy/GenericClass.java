package Testmjy;

public class GenericClass<T> {
    private T item;




    public T getItem() {
        return item;
    }



    public void setItem(T item) {
        this.item = item;
    }



    public static void main(String[] args) {

        GenericClass<String> type = new GenericClass<>();
        type.setItem("mjy11");
        System.out.println(type.getItem());

        GenericClass<Boolean> type1 = new GenericClass<>();
        type1.setItem(true);
        System.out.println(type1.getItem());

        GenericClass type2 = new GenericClass();
        type2.setItem("string");
        type2.setItem(10);


        System.out.println(type2.getItem());



    }
}
