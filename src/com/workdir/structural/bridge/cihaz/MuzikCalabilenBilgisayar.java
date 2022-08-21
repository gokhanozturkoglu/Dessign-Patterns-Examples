package com.workdir.structural.bridge.cihaz;

import com.workdir.structural.bridge.Music;
import com.workdir.structural.bridge.muzikcalar.MuzikCalar;
import com.workdir.structural.bridge.sescihazi.SesCihazi;

public abstract class MuzikCalabilenBilgisayar {

    protected SesCihazi sesCihazi;
    protected MuzikCalar muzikCalar;

    public MuzikCalabilenBilgisayar() {}

    public MuzikCalabilenBilgisayar(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        this.sesCihazi = sesCihazi;
        this.muzikCalar = muzikCalar;
    }

    void muzikCal(Music music) {
        String ses = muzikCalar.muzikCal(music);
        sesCihazi.sesiCal(ses);
    }
}
