package com.multithreading.thread.demo.ATMMachine;

import com.multithreading.thread.demo.ATMMachine.card.CardDetails;
import com.multithreading.thread.demo.ATMMachine.state.ReadyState;
import com.multithreading.thread.demo.ATMMachine.state.State;

public class ATM {
    private final String machineId;
    private State state;

    public ATM(String machineId) {
        this.machineId = machineId;
        this.state = new ReadyState(this);
    }

    public void init() {
        this.state.init();
    }

    public boolean readCardDetails(CardDetails cardDetails) {
        return this.state.readCardDetails(cardDetails);
    }

    public void withdrawCash(int amount) {
        this.state.withdraw(amount);
    }

    public void ejectCard() {
        this.state.ejectCard();
    }

    public void changeState(State newState) {
        this.state = newState;
    }
}
