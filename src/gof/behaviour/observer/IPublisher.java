package gof.behaviour.observer;

public interface IPublisher {
    void register(ISubscriber obj);

    void unreister(ISubscriber obj);

    void notifySubscriber();

    Object getUpdate(ISubscriber obj);



}
