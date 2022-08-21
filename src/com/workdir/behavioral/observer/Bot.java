package com.workdir.behavioral.observer;

public class Bot implements User{

    private final static int INVESTMENT_FACTOR = 10;

    @Override
    public void update(int price) {
        System.out.println("I am a bot, and I will invest " + price*INVESTMENT_FACTOR);
    }
}
