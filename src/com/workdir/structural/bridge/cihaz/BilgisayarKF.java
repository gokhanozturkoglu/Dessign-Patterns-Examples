package com.workdir.structural.bridge.cihaz;

import com.workdir.structural.bridge.Music;
import com.workdir.structural.bridge.muzikcalar.Fizy;
import com.workdir.structural.bridge.sescihazi.Kulaklik;

public class BilgisayarKF extends MuzikCalabilenBilgisayar {

    public BilgisayarKF() {

        sesCihazi = new Kulaklik();
        muzikCalar = new Fizy();
    }

    @Override
    public void muzikCal(Music music) {
        System.out.println("Bilgisayar çalıştı.");
        super.muzikCal(music);
    }
}
