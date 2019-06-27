package gof.creat.singleton;

public class Billsingle {
    private Billsingle() {

    }

    private static class SingleHe{
        private static final Billsingle instance = new Billsingle();
    }

    public static Billsingle getInstance() {
        return SingleHe.instance;

    }
}
