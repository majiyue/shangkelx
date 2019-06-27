package gof.structure.adapter;

public class SocketAdapterImpl implements SocketAdapter {

    private Socket socket = new Socket();

    private Volt canvart(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }


    @Override
    public Volt get2Volt() {
        return canvart(socket.getVolt(), 110);
    }

    @Override
    public Volt get10Volt() {
        return canvart(socket.getVolt(), 22);
    }

    @Override
    public Volt get220Volt() {
        return socket.getVolt();
    }


}
