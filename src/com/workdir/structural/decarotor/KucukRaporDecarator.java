package com.workdir.structural.decarotor;

public class KucukRaporDecarator extends RaporDecarotator {

    private int genislik;

    public KucukRaporDecarator (Rapor rapor) {
        super(rapor);
        this.genislik = 30;
    }

    @Override
    public String getMetin() {
        String metin = super.getMetin();

        String kucukMetin = RaporUtil.metniSigdir(metin, genislik);

        return metin;
    }
}
