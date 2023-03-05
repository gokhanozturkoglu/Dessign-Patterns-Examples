package com.workdir.structural.composite.compositeLast;

import java.math.BigDecimal;
import java.util.List;

public class TotalPriceCalculateUtil {

    public static BigDecimal getTotalProductPrice(List<Product> productList) {

        BigDecimal totalPrice = BigDecimal.ZERO;

        productList.forEach(product -> {
            totalPrice.add(product.getPrice());
        });

        return totalPrice;
    }

    public static BigDecimal getTotalPackagePrice(List<Package> packageList) {

        BigDecimal totalPrice = BigDecimal.ZERO;

        packageList.forEach(paket -> {
            totalPrice.add(paket.getPrice());
        });

        return totalPrice;
    }

}
