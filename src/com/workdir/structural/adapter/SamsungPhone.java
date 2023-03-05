package com.workdir.structural.adapter;

public class SamsungPhone implements Phone {

    private int runningVolt;

    public SamsungPhone() {
        this.runningVolt = 5;
    }

    @Override
    public int charge() {
        System.out.println("Samsung phone is running.");
        return runningVolt;
    }
}
