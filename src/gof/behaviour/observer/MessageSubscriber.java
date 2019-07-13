package gof.behaviour.observer;

import java.util.Spliterator;

public class MessageSubscriber implements ISubscriber {

    private IPublisher publisher;

    private String name;

    public MessageSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void setPublisher(IPublisher obj) {
        this.publisher = obj;
    }

    @Override
    public void ubdate() {
        String msg = (String) publisher.getUpdate(this);
        if ( msg == null ) {
            System.out.println(name + ":: No new Message");

        }else {
            System.out.println(name + "::New message" + msg);
        }
    }
}
