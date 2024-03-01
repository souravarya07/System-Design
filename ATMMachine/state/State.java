package com.multithreading.thread.demo.ATMMachine.state;

import com.multithreading.thread.demo.ATMMachine.card.CardDetails;

public interface State {

    void init();
    boolean readCardDetails(CardDetails cardDetails);
    void ejectCard();
    void withdraw(int amount);
}
