package com.workdir.structural.composite.compositeLast;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Kumanya implements Fiyatlanabilir{

    private String name;
    private List<Product> productList;
    private List<Package> packageList;

    public Kumanya(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
        this.packageList = new ArrayList<>();
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

    @Override
    public BigDecimal getPrice() {

        BigDecimal totalProductPrice = TotalPriceCalculateUtil.getTotalProductPrice(productList);
        BigDecimal totalPackagePrice = TotalPriceCalculateUtil.getTotalPackagePrice(packageList);
        BigDecimal totalPrice = totalProductPrice.add(totalPackagePrice);

        return totalPrice;
    }
}
