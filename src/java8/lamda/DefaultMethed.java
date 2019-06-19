package java8.lamda;

/*
接口练习。
 */


@FunctionalInterface
interface IFarmula {
    double caculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(positive(a));
    }

    static int positive(int a) {
        return a > 0 ? a : 0;
    }


    default void log(Number result) {

        System.out.println(result);
    }

}

class Formula implements IFarmula {

    @Override
    public double caculate(int a) {
        double result = sqrt((int) sqrt(a));
        log(result);
        return result;
    }

    @Override
    public void log(Number result) {
        System.out.println("damo: " + result);
    }
}

public class DefaultMethed {
    public static void main(String[] args) {

        Formula f1 = new Formula();
        f1.caculate(16);
        f1.caculate(-16);

        f1.log(1.88888);
        f1.log(f1.sqrt(100));


        IFarmula f2 = new IFarmula() {
            @Override
            public double caculate(int a) {
                double result = sqrt((int) sqrt(a));
                log(result);
                return result;
            }
        };


        f2.caculate(256);
        f2.log(IFarmula.positive(-20));


        IFarmula f3 = a -> Math.sqrt(a * 100);
        f3.log(f3.caculate(-4));

    }

}
