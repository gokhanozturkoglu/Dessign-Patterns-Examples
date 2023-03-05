package com.workdir.structural.bridgeilk;

public class App {

    public static void main(String[] args) {

        Music music = new Music("Sezen Aksu - Gülümse", "Gülümse hadi gülümse");

        Bilgisayar bilgisayar = new Bilgisayar();

        bilgisayar.muzikCal(music);
    }
}
