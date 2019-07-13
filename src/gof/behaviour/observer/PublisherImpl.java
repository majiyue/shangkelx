package gof.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class PublisherImpl implements IPublisher {

    private List<ISubscriber> subscribers;

    private String message;

    private boolean changed;

    private final Object MUREX = new Object();

    public PublisherImpl() {

        this.subscribers = new ArrayList<>();

    }

    @Override
    public void register(ISubscriber obj) {
        if ( obj == null ) {
            throw new NullPointerException("Null Subscriber");
        }
        synchronized (MUREX) {
            if ( !subscribers.contains(obj) ) {
                subscribers.add(obj);

                obj.setPublisher(this);

            }
        }
    }

    @Override
    public void unreister(ISubscriber obj) {
        synchronized (MUREX) {
            subscribers.remove(obj);

        }


    }

    @Override
    public void notifySubscriber() {
        List<ISubscriber> subscribers;
        synchronized (MUREX) {
            if ( !changed ) {
                return;
            }
            subscribers = new ArrayList<>(this.subscribers);
            this.changed = false;

        }
        for (ISubscriber subscriber : subscribers) {
            subscriber.ubdate();

        }
        this.message=null;
    }

    @Override
    public Object getUpdate(ISubscriber obj) {
        return this.message;
    }

    public void postmessage(String msg) {
        System.out.println("Message post to topic" + msg);
        this.message = msg;
        this.changed = true;
        notifySubscriber();

    }
}
