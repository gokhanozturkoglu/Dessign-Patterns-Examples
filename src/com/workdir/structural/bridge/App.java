package com.workdir.structural.bridge;

import com.workdir.structural.bridge.cihaz.BilgisayarKF;
import com.workdir.structural.bridge.cihaz.Telefon;
import com.workdir.structural.bridge.muzikcalar.Fizy;
import com.workdir.structural.bridge.muzikcalar.Spotify;
import com.workdir.structural.bridge.sescihazi.Kulaklik;

public class App {

    public static void main(String[] args) {

        Music music = new Music("Sezen Aksu - Gülümse", "Gülümse hadi gülümse");

        BilgisayarKF bilgisayarKF = new BilgisayarKF();
        bilgisayarKF.muzikCal(music);

        System.out.println("*********************");

        Telefon telefon = new Telefon(new Kulaklik(), new Fizy());
        telefon.muzikCal(music);

        System.out.println("*********************");

        Telefon telefon2 = new Telefon(new Kulaklik(), new Spotify());
        telefon2.muzikCal(music);
    }
}
