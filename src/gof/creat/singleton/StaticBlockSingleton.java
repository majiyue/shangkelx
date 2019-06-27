package gof.creat.singleton;


import kexialianxi.string.StringTestMianShi;

class StaticBlock{
    private static StaticBlock instance;
    private StaticBlock(){

    }

    static {
        try {
            instance = new StaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Exception happens an creating instance");
        }

    }

    public static StaticBlock getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());

        String ref = super.toString().split("@")[1];
        return "I am " + ref + ",a static block singleton";
    }
}

public class StaticBlockSingleton {
    public static void main(String[] args) {
        StaticBlock instance = StaticBlock.getInstance();
        System.out.println(instance);
    }
}
