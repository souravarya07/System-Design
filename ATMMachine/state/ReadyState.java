package com.multithreading.thread.demo.ATMMachine.state;

import com.multithreading.thread.demo.ATMMachine.ATM;
import com.multithreading.thread.demo.ATMMachine.card.CardDetails;

public class ReadyState implements State{
    private final ATM atm;

    public ReadyState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void init() {
        System.out.println("Card is inserted");
        this.atm.changeState(new CardReadingState(this.atm));
    }

    @Override
    public boolean readCardDetails(CardDetails cardDetails) {
        throw new IllegalStateException("Read card details not allowed at this moment!!");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("you cannot eject card now!!");
    }

    @Override
    public void withdraw(int amount) {
        throw new IllegalStateException("Please wait while your card details are being read!!");
    }
}
