package Testmjy;



public class Triple<T extends Number & Comparable<T>> {

    private T x;
    private T y;
    private T z;

    public Triple(T x, T y, T z) {

        this.x = x;
        this.y = y;
        this.z = z;

    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getZ() {
        return z;
    }

    public void setZ(T z) {
        this.z = z;
    }

    private T addValues(){
        Number v = x.intValue()+z.intValue()+y.intValue();
        return (T)v;


       }
    private T largest  (){
        T max = x;
        if ( y.compareTo(max)>0 ){
            max = y;
        }
        if ( z.compareTo(max)>0 ){
            max = z;
        }
        return max;

    }

    public static void main(String[] args) {
        Triple<Integer> t = new Triple<>(8,10,9);

        Integer sum = t.addValues();
        System.out.println(sum);


        System.out.println(t.largest());



        t.setZ(70);
        t.setX(20);
        t.setY(55);
        System.out.println(t.largest());

    }


}
