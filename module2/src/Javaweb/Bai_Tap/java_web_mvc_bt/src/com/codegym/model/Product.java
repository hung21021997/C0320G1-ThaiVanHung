package com.codegym.model;

public class Products {
    private int idProduct;
    private String nameProduct;
    private String rateProduct;
    private String makerProduct;

    public Products() {
    }

    public Products(int idProduct, String nameProduct, String rateProduct, String makerProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.rateProduct = rateProduct;
        this.makerProduct = makerProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getRateProduct() {
        return rateProduct;
    }

    public void setRateProduct(String rateProduct) {
        this.rateProduct = rateProduct;
    }

    public String getMakerProduct() {
        return makerProduct;
    }

    public void setMakerProduct(String makerProduct) {
        this.makerProduct = makerProduct;
    }
}
