package com.workdir.structural.bridgeilk;

public class Music {
    private String adi;
    private String ses;

    public Music(String adi, String ses) {
        this.adi = adi;
        this.ses = ses;
    }

    @Override
    public String toString() {
        return adi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSes() {
        return ses;
    }

    public void setSes(String ses) {
        this.ses = ses;
    }
}
