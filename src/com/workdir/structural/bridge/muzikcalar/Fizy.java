package com.workdir.structural.bridge.muzikcalar;

import com.workdir.structural.bridge.Music;

public class Fizy implements MuzikCalar{

    @Override
    public String muzikCal(Music music) {
        System.out.println("Fizy " + music + " şarkısını çalıyor. ");

        return music.getSes();
    }
}
