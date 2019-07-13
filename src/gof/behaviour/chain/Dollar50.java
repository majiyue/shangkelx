package gof.behaviour.chain;

public class Dollar50 implements DispenseChain {

    private DispenseChain chain;


    @Override
    public void nextHandler(DispenseChain next) {

        this.chain = next;

    }

    @Override
    public void handle(Currency currency) {
        int current = currency.getAmount();
        if (current >= 50 ) {
            int money = current / 50;
            int remain = current % 50;
            System.out.println("Dispensing " + money + " 50$ note");
            if ( remain != 0 ) {
                this.chain.handle(new Currency(remain));

            }

        }else {
            this.chain.handle(currency);

        }
    }
}
