package com.workdir.structural.composite.compositeFirst;

import java.math.BigDecimal;

public class App1 {

    public static void main(String[] args) {

        Product domates = new Product("Domates", BigDecimal.TEN);
        Product patetes = new Product("Domates", BigDecimal.ONE);
        Product sogan = new Product("Domates", BigDecimal.ONE);

        Package sebzePaketi = new Package("Sebze Paketi");
        sebzePaketi.getProductList().add(domates);
        sebzePaketi.getProductList().add(patetes);
        sebzePaketi.getProductList().add(sogan);

        Product sesSistemi = new Product("Ses Sistemi", BigDecimal.valueOf(5000));
        Product kulaklik = new Product("Kulaklik", BigDecimal.valueOf(1000));

        Package teknolojiPaketi = new Package("Teknoloji Paketi");
        teknolojiPaketi.getProductList().add(sesSistemi);
        teknolojiPaketi.getProductList().add(kulaklik);

        Product futbolTopu = new Product("Futbol Topu", BigDecimal.valueOf(100));

        Cart cart = new Cart("Benim Sepetim");
        cart.getPackageList().add(sebzePaketi);
        cart.getPackageList().add(teknolojiPaketi);
        cart.getProductList().add(futbolTopu);

        BigDecimal totalPrice = cart.getTotalPrice();

        System.out.println("Ödenecek Tutar = " + totalPrice + " TL");
    }
}
