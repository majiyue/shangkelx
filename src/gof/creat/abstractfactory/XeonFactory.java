package gof.creat.abstractfactory;

public class XeonFactory extends AbstractFactory {

    @Override
    public CPU creatCPU() {
        return new XeonW();
    }

    @Override
    public MMU creatMMU() {
        return new XeonMMU();
    }

}
