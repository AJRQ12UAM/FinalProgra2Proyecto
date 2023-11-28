package com.mycompany.proyectofinalprogra2;

import com.mycompany.proyectofinalprogra2.Clases.SQLScripts;

public class ProyectoFinalProgra2 {

    public static void main(String[] args) {
        // Valores de ejemplo para la inserción
        String productID = "AR123";
        String productName = "tEST";
        double productPrice = 100.0;
        String productType = "TEST";
        String productCategory = "hOGAR";
        String productTrade = "nO LOSE";
        int productQtyInventory = 5;
        int productQtySale = 0;
        int productOnCar = 0;
        String productTax = "12";

        // Llama al método performInsert con los valores de ejemplo
        SQLScripts.performInsert(productID, productName, productPrice, productType, productCategory,
                productTrade, productQtyInventory, productQtySale, productOnCar, productTax);

        // Llama al método para obtener y mostrar los valores actuales
        SQLScripts.printCurrentValues();

        // Llama al método para obtener y mostrar la información de un producto específico
        SQLScripts.printProductInfo(productID);
        
        SQLScripts.updateProductQtyInventory(productID, 3);
        
        SQLScripts.updateProductField(productID, "productPrice", "2000");
        SQLScripts.updateProductField(productID, "productOnCar", "1");
        
    }
}
