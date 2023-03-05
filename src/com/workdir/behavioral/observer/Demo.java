package com.workdir.behavioral.observer;

public class Demo {

    public static void main(String[] args) {
        Bitcoin bitcoin = new Bitcoin();

        Trader trader = new Trader();
        Student student = new Student();
        Corporate corporate = new Corporate();
        Bot bot = new Bot();

        bitcoin.subscribe(trader);
        bitcoin.setPrice(61);
        bitcoin.unsubscribe(trader);
        bitcoin.setPrice(12);
        bitcoin.subscribe(student);
        bitcoin.subscribe(corporate);
        bitcoin.setPrice(22);
        bitcoin.subscribe(bot);
        bitcoin.unsubscribe(corporate);
        bitcoin.setPrice(32);
    }
}
