package java8.lamda;

public class BasicLamda {

    private static void engine(Calculatar calculatar) {
        int x = 2, y = 4;
        int result = calculatar.calculate(x, y);
        System.out.println(result);
    }


    private static Calculatar divide() {
        return (x, y) -> y / x;
    }

    public static void main(String[] args) {

        engine((x, y) -> x + y);
        engine((x, y) -> x * y);
        engine((x, y) -> x - y);

        engine(divide());


        Calculatar c1 = divide();
        System.out.println(c1.calculate(3,10));

    }
}
