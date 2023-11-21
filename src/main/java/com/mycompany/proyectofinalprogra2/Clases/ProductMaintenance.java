package com.mycompany.proyectofinalprogra2.Clases;

public class ProductMaintenance extends Products{

    private String productCreator;
    private String productLastUpdateDate;
    private int productQtyInventory;
    private int productQTYSale;

    public String getProductCreator() {
        return productCreator;
    }

    public void setProductCreator(String productCreator) {
        this.productCreator = productCreator;
    }

    public String getProductLastUpdateDate() {
        return productLastUpdateDate;
    }

    public void setProductLastUpdateDate(String productLastUpdateDate) {
        this.productLastUpdateDate = productLastUpdateDate;
    }

    public int getProductQtyInventory() {
        return productQtyInventory;
    }

    public void setProductQtyInventory(int productQtyInventory) {
        this.productQtyInventory = productQtyInventory;
    }

    public int getProductQTYSale() {
        return productQTYSale;
    }

    public void setProductQTYSale(int productQTYSale) {
        this.productQTYSale = productQTYSale;
    }

    public ProductMaintenance() {
    }

    public ProductMaintenance(String productCreator, String productLastUpdateDate, int productQtyInventory, int productQTYSale) {
        this.productCreator = productCreator;
        this.productLastUpdateDate = productLastUpdateDate;
        this.productQtyInventory = productQtyInventory;
        this.productQTYSale = productQTYSale;
    }

    @Override
    public String toString() {
        return "ProductMaintenance{" + "productCreator=" + productCreator + ", productLastUpdateDate=" + productLastUpdateDate + ", productQtyInventory=" + productQtyInventory + ", productQTYSale=" + productQTYSale + '}';
    }

}
