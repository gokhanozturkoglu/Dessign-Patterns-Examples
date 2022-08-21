package com.workdir.structural.composite.compositeFirst;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private String name;
    private List<Product> productList;
    private List<Package> packageList;

    public Cart(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
        this.packageList = new ArrayList<>();
    }

    public BigDecimal getTotalPrice() {

        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Product product : productList) {
            totalPrice = totalPrice.add(product.getPrice());
        }

        for (Package paket : packageList) {

            List<Product> productList = paket.getProductList();

            for (Product product : productList) {
                totalPrice = totalPrice.add(product.getPrice());
            }
        }

        return totalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Package> getPackageList() {
        return packageList;
    }

    public void setPackageList(List<Package> packageList) {
        this.packageList = packageList;
    }
}
