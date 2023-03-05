package com.workdir.structural.bridge.cihaz;

import com.workdir.structural.bridge.Music;
import com.workdir.structural.bridge.muzikcalar.MuzikCalar;
import com.workdir.structural.bridge.sescihazi.SesCihazi;

public class Telefon extends MuzikCalabilenBilgisayar {

    public Telefon(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        super(sesCihazi, muzikCalar);
    }

    @Override
    public void muzikCal(Music music) {
        System.out.println("Telefon ses çalıyor.");
        super.muzikCal(music);
    }
}
