package gof.creat.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        AbstractFactory coreFactory = AbstractFactory.getFactory(Architecture.CORE);
        CPU cpu = coreFactory.creatCPU();
        System.out.println(cpu);

        AbstractFactory xeonFactory = AbstractFactory.getFactory(Architecture.XEON);
        cpu = xeonFactory.creatCPU();
        System.out.println(cpu);


    }
}