package gof.behaviour.observer;

public class DemoObserver {
    public static void main(String[] args) {
        PublisherImpl publisher = new PublisherImpl();

        ISubscriber tom = new MessageSubscriber("Tom");
        ISubscriber jerry = new MessageSubscriber("Jerry");
        ISubscriber mjy = new MessageSubscriber("Mjy");
        ISubscriber mjy1 = new MessageSubscriber("Mjy1");
        ISubscriber mjy2 = new MessageSubscriber("Mjy2");
        ISubscriber mjy3 = new MessageSubscriber("Mjy3");

        publisher.register(tom);
        publisher.register(jerry);
        publisher.register(mjy);
        publisher.register(mjy1);
        publisher.register(mjy2);
        publisher.register(mjy3);

        tom.ubdate();

        mjy2.ubdate();
        publisher.postmessage("*** and ***  divide");


    }
}
