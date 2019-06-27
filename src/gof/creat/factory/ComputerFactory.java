package gof.creat.factory;

public class ComputerFactory {

    private static Computer getComputer(String type, String ram, String hdd, String cpu) {

        if ( "PC".equalsIgnoreCase(type) ) {
            return new PC(ram, hdd, cpu);
        } else if ( "Server".equalsIgnoreCase(type) ) {
            return new Server(ram, hdd, cpu);
        }
        return null;
    }

    public static void main(String[] args) {

        Computer computer = ComputerFactory.getComputer("PC", "2GB", "500GB", "core i7");
        System.out.println(computer);
        computer = ComputerFactory.getComputer("Server", "100GB", "500T", "i66");
        System.out.println(computer);

    }


}
