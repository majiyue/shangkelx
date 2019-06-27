package gof.creat.abstractfactory;

public abstract class AbstractFactory {
    public abstract CPU creatCPU();

    public abstract MMU creatMMU();


    private static final CoreFactory CORE = new CoreFactory();
    private static final XeonFactory XEON = new XeonFactory();

    public static AbstractFactory getFactory(Architecture architecture) {
        AbstractFactory factory = null;

        switch (architecture) {
            case XEON:
                factory = XEON;
                break;
            case CORE:
                factory = CORE;
                break;
            default:
        }
        return factory;
    }


}
