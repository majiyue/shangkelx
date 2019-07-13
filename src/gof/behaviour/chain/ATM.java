package gof.behaviour.chain;

import java.util.Scanner;

public class ATM {
    private DispenseChain atm;


    public ATM() {
        this.atm = new Dollar50();


        DispenseChain c20 = new Dollar20();
        DispenseChain c10 = new Dollar10();


        atm.nextHandler(c20);
        c20.nextHandler(c10);

    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);

            amount = input.nextInt();
            if ( amount % 10 != 0 ) {
                System.out.println("amount should be 10S");
                continue;
            }
            atm.atm.handle(new Currency(amount));


        }
    }

}
