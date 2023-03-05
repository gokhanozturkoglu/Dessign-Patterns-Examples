package com.workdir.structural.bridgeilk;

public class Bilgisayar {

    private Spotify spotify;
    private Hoparlor hoparlor;

    public Bilgisayar() {
        spotify = new Spotify();
        hoparlor = new Hoparlor();
    }

    public void muzikCal(Music music) {
       String ses = spotify.muzikCal(music);
       hoparlor.sesiCal(ses);
    }

    public Spotify getSpotify() {
        return spotify;
    }

    public void setSpotify(Spotify spotify) {
        this.spotify = spotify;
    }

    public Hoparlor getHoparlor() {
        return hoparlor;
    }

    public void setHoparlor(Hoparlor hoparlor) {
        this.hoparlor = hoparlor;
    }
}
