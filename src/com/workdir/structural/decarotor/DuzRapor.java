package com.workdir.structural.decarotor;

/** Run time da object hiyerarşisini değiştirebilmek için bize lazım olan bir pattern*/
public class DuzRapor implements Rapor {

    private String metin;

    public DuzRapor(String metin) {
        this.metin = metin;
    }

    @Override
    public String getMetin() {
        return metin;
    }
}
