package com.multithreading.thread.demo.ATMMachine.state;

import com.multithreading.thread.demo.ATMMachine.ATM;
import com.multithreading.thread.demo.ATMMachine.card.CardDetails;

public class CardEjectingState implements State{
    private final ATM atm;

    public CardEjectingState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void init() {
        throw new IllegalStateException("This operation not allowed now!!");
    }

    @Override
    public boolean readCardDetails(CardDetails cardDetails) {
        throw  new IllegalStateException("Not allowed");
    }

    @Override
    public void ejectCard() {
        System.out.println("Please collect your card!!");
//        this.atm.changeState(new ReadyState(this.atm));
    }

    @Override
    public void withdraw(int amount) {

    }
}
