package gof.creat.singleton;

class Eager{
    private static final Eager instance = new Eager();

    private Eager() {

    }

    public static Eager getInstance() {
        return instance;
    }

    private String pow = "meat";

    public String getPow() {
        return pow;
    }
}

public class EngerSingleton {



    public static void main(String[] args) {
        Eager eager = Eager.getInstance();
        System.out.println(eager.getPow());
    }
}
