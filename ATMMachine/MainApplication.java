package com.multithreading.thread.demo.ATMMachine;

import com.multithreading.thread.demo.ATMMachine.card.CardDetails;

public class MainApplication {
    public static void main(String[] args) {
        ATM atm = new ATM("ABC1234");
        System.out.println("ATM Machine started !!!");
        atm.init();
        CardDetails cardDetails = new CardDetails(98761234, 433, "01/25");
        atm.readCardDetails(cardDetails);
        atm.withdrawCash(1000);
        atm.ejectCard();
        System.out.println("ATM Machine back to ideal state!!");
    }
}
