package gof.behaviour.chain;

public class Dollar20 implements DispenseChain{
    private DispenseChain chain;


    @Override
    public void nextHandler(DispenseChain next) {

        this.chain = next;

    }

    @Override
    public void handle(Currency currency) {
        int current = currency.getAmount();
        if (current >= 20 ) {
            int money = current / 20;
            int remain = current % 20;
            System.out.println("Dispensing " + money + " 20$ note");
            if ( remain != 0 ) {
                this.chain.handle(new Currency(remain));

            }

        }else {
            this.chain.handle(currency);

        }
    }
}