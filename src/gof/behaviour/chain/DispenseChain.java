package gof.behaviour.chain;

public interface DispenseChain {
    void nextHandler(DispenseChain next);

    void handle(Currency currency);
}
