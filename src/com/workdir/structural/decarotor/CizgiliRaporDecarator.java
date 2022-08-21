package com.workdir.structural.decarotor;

public class CizgiliRaporDecarator extends RaporDecarotator {

    public CizgiliRaporDecarator(Rapor rapor) {
        super(rapor);
    }

    @Override
    public String getMetin() {
        String metin = super.getMetin();

        String cizgiliMetin = RaporUtil.getCizgiliMetin(metin);
        return metin;
    }
}
