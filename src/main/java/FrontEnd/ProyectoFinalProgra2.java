package FrontEnd;

import AccesoDB.*;

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
        ProductsDB.performInsert(productID, productName, productPrice, productType, productCategory,
                productTrade, productQtyInventory, productQtySale, productOnCar, productTax);

        // Llama al método para obtener y mostrar los valores actuales
        ProductsDB.printCurrentValues();

        // Llama al método para obtener y mostrar la información de un producto específico
        ProductsDB.printProductInfo(productID);

        ProductsDB.reduceProductQtyInventoryAndIncreaseQtySale(productID, 3);

        ProductsDB.updateProductField(productID, "productPrice", "2000");

        //Este agrega el 1 cuando esta en el carro, entonces bloquea el borrado
        ProductsDB.updateProductField(productID, "productOnCar", "1");

        //Nuevo, borrar producto, si, no esta en ningun carro
        ProductsDB.deleteProduct(productID);

        //Insert an user en usersDB
        UsersDB.insertUser("123", "John", "Doe", "john.doe@example.com", "Customer", "123 Main St", "555-1234", "12345", "0");
    }
}
