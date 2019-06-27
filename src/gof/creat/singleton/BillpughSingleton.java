package gof.creat.singleton;

public class BillpughSingleton {
    private BillpughSingleton() {


    }

    private static class SingletonHelper{

        private static final BillpughSingleton INSTANCE =
                new BillpughSingleton();

    }


    public static BillpughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
