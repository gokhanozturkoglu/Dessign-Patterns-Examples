package com.workdir.structural.decarotor;

public abstract class RaporDecarotator implements Rapor {

    private Rapor rapor;

    public RaporDecarotator(Rapor rapor) {
        this.rapor = rapor;
    }

    @Override
    public String getMetin() {
        return rapor.getMetin();
    }
}
