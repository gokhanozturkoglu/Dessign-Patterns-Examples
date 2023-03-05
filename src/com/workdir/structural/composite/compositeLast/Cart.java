package com.workdir.structural.composite.compositeLast;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private String name;
    private List<Fiyatlanabilir> fiyatlanabilirList;

    public Cart(String name) {
        this.name = name;
        this.fiyatlanabilirList = new ArrayList<>();
    }

    public BigDecimal totalPayablePrice() {

        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Fiyatlanabilir fiyatlanabilir : fiyatlanabilirList) {
            totalPrice = totalPrice.add(fiyatlanabilir.getPrice());
        }

        return totalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Fiyatlanabilir> getFiyatlanabilirList() {
        return fiyatlanabilirList;
    }

    public void setFiyatlanabilirList(List<Fiyatlanabilir> fiyatlanabilirList) {
        this.fiyatlanabilirList = fiyatlanabilirList;
    }
}
