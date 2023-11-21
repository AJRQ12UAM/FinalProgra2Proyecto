package com.mycompany.proyectofinalprogra2.Clases;

public class Products {

    private String productID;
    private String productName;
    private double ProductPrice;
    private String productType;
    private String productTrade;
    private String productCategory;

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductTrade() {
        return productTrade;
    }

    public void setProductTrade(String productTrade) {
        this.productTrade = productTrade;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public Products() {
    }

    public Products(String productID, String productName, double ProductPrice, String productType, String productTrade, String productCategory) {
        this.productID = productID;
        this.productName = productName;
        this.ProductPrice = ProductPrice;
        this.productType = productType;
        this.productTrade = productTrade;
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Products{" + "productID=" + productID + ", productName=" + productName + ", ProductPrice=" + ProductPrice + ", productType=" + productType + ", productTrade=" + productTrade + ", productCategory=" + productCategory + '}';
    }
    
}
