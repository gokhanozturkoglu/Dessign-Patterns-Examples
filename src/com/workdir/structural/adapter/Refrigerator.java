package com.workdir.structural.adapter;

//Ütü
public class Refrigerator implements ElectricalAppliances {

    private int volt;

    public Refrigerator() {
        this.volt = 220;
    }

    @Override
    public int plugInAndRun() {

        System.out.println("Refrigerator running.");
        return volt;
    }
}
