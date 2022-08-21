package com.workdir.structural.bridge.muzikcalar;

import com.workdir.structural.bridge.Music;

public class Spotify implements MuzikCalar {

    @Override
    public String muzikCal(Music music) {
         System.out.println("Spotify " + music + " şarkısını çalıyor. ");
        return music.getSes();
    }
}
