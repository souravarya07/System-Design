package com.multithreading.thread.demo.ATMMachine.state;

import com.multithreading.thread.demo.ATMMachine.ATM;
import com.multithreading.thread.demo.ATMMachine.card.CardDetails;

public class CardReadingState implements State{
    private final ATM atm;

    public CardReadingState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void init() {
        throw new IllegalStateException("Insert card Operation not allowed");
    }

    @Override
    public boolean readCardDetails(CardDetails cardDetails) {
        System.out.println("Checking your card details, your card number : " + cardDetails.getCardNumber()
                + " card cvv : " + cardDetails.getCvv() );
        if (cardDetails.getCardNumber() == 98761234 && cardDetails.getCvv() == 433) {
            this.atm.changeState(new CashDispensingState(this.atm));
            return true;
        }
        return false;
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Eject card operation not allowed now!!");
    }

    @Override
    public void withdraw(int amount) {
        throw new IllegalStateException("You cannot withdraw cash at this moment!!");
    }
}
