package java8.fi;

public class DiamandInterface implements InterfaceB, InterfaceA, InterfaceC {


    public static void main(String[] args) {
        InterfaceA a = new DiamandInterface();
        InterfaceB b = new DiamandInterface();
        InterfaceC c = new DiamandInterface();
        a.doSomething();
        b.doSomething();
        c.doSomething();
    }

    @Override
    public void doSomething() {
        System.out.println("Concrate do something");
    }
}


interface InterfaceA {
    void doSomething();
}

interface InterfaceB {
    void doSomething();
}


interface InterfaceC extends InterfaceA, InterfaceB {
    void doSomething();
}
