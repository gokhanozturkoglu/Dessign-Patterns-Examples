package com.workdir.structural.adapter;

//Ütü
public class Iron implements ElectricalAppliances {

    private int volt;

    public Iron() {
        this.volt = 220;
    }

    @Override
    public int plugInAndRun() {

        System.out.println("Iron running.");
        return volt;
    }
}
