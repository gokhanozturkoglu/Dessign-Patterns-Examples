package com.workdir.structural.decarotor;

public class RaporUtil {

    public static String getCizgiliMetin(String metin) {

        String[] satirList = metin.split("\n");

        String cizgiliMetin = "";

        for (String eachSatir : satirList) {
            String cizgiliSatir = herSatiraBirCizgiEkle(eachSatir);

            cizgiliMetin = cizgiliMetin + cizgiliSatir;
        }

        return cizgiliMetin;
    }

    private static String herSatiraBirCizgiEkle(String eachSatir) {

        String yeniSatir;

        if (eachSatir.trim().length() == 0) {
            yeniSatir = "\n";
        } else {
            yeniSatir = "\n- " + eachSatir;
        }

        return yeniSatir;
    }

    public static String metniSigdir(String metin, int genislik) {

        String kucukSatirliMetin = "";

        String[] satirList = metin.split("\n");

        for (String eachSatir : satirList) {
            if (eachSatir.length() <= genislik) {
                 //aynı şekilde ekle
            } else {
                //küçült ve öyle ekle
            }
        }

        return kucukSatirliMetin;
    }
}
