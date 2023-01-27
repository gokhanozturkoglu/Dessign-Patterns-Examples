package com.workdir.structural.adapter;

//Priz
public class Plug {

    public void giveElectric(ElectricalAppliances electricalAppliances) {

        int volt = electricalAppliances.plugInAndRun();
        System.out.println("Gettings " + volt + " volt from the plug");
    }
}
