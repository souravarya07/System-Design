package com.multithreading.thread.demo.ATMMachine.state;

import com.multithreading.thread.demo.ATMMachine.ATM;
import com.multithreading.thread.demo.ATMMachine.card.CardDetails;

public class CashDispensingState implements State{

    private final ATM atm;

    public CashDispensingState(ATM atm) {
        this.atm = atm;
    }


    @Override
    public void init() {
        throw  new IllegalStateException("Not allowed");
    }

    @Override
    public boolean readCardDetails(CardDetails cardDetails) {
        throw  new IllegalStateException("Not allowed");
    }

    @Override
    public void ejectCard() {
        throw  new IllegalStateException("Not allowed");
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Please collect your amount : " + amount);
        this.atm.changeState(new CardEjectingState(this.atm));
    }
}
