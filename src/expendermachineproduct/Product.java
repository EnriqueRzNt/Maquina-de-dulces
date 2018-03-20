/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expendermachineproduct;

/**
 *
 * @author user
 */
public class Product {

    //declaro variables
    private int CodeProduct;
    private String NameProduct;
    private String QuantityOfProduct;
    private int PriceProduct;
    //termino de declarar variables

    public Product(int CodeProduct, String NameProduct, String QuantityOfProduct, int PriceProduct) {
        this.CodeProduct = CodeProduct;
        this.NameProduct = NameProduct;
        this.QuantityOfProduct = QuantityOfProduct;
        this.PriceProduct = PriceProduct;

    }//end of constructor

    //creation of method setCodeProduct
    public void setCodeProduct(int CodeProduct) {
        this.CodeProduct = CodeProduct;

    }//end of method setCodeProduct

    //creation of method getCodeProduct
    public int getCodeProduct() {
        System.out.println("the code of this product is: " + CodeProduct);
        return CodeProduct;
    }//end of method getCodeProduct

    //creation of method setNameProduct
    public void setNameProduct(String NameProduct) {
        this.NameProduct = NameProduct;

    }//end of method setNameProduct

    //creation of method getNameProduct
    public String getNameProduct() {
        System.out.println("the name of this product is: " + NameProduct);
        return NameProduct;
    }//end of method getNameProduct

    //creation of method setQuantityOfProduct
    public void setQuantityOfProduct(String QuantityOfProduct) {
        this.QuantityOfProduct = QuantityOfProduct;

    }//end of method setQuantityOfProduct

    //creation of method getQuantityOfProduct
    public String getQuantityOfProduct() {
        System.out.println("the quantity of thid product is : " + QuantityOfProduct);
        return QuantityOfProduct;
    }//end of method getQuantityOfProduct

    //creation of method setPriceProduct
    public void setPriceProduct(int PriceProduct) {
        this.PriceProduct = PriceProduct;

    }//end of method setPriceProduct

    //creation of method getPriceProduct
    public int getPriceProduct() {
        return PriceProduct;
    }//end of method getPriceProduct
    

    //creation of method toString
    @Override
    public String toString() {
        String aux = "";

        aux = "-----------------\n||" + NameProduct + "||\n||               ||\n||" + QuantityOfProduct + "        $" + PriceProduct + "||\n||               ||\n||-----►code: " + CodeProduct+"||\n";

        return aux;

        
        
    }//end of method toString

}
