/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expendermachineproduct;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ExpenderMachineProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option1;
        int dinero;
        int dinero2;
        int codigo;
        int repetircompra2 = 0;

        //creation of objects
        Product Product1 = new Product(100, "papas  adobadas", "40 g", 12);
        Product Product2 = new Product(101, "papas naturales", "40 g", 10);
        Product Product3 = new Product(102, "papas con queso", "40 g", 12);
        Product Product4 = new Product(103, "papas  jalapeño", "40 g", 11);
        Product Product5 = new Product(104, "galletas chokis", "50 g", 14);
        Product Product6 = new Product(105, "galletas   lord", "45 g", 12);
        Product Product7 = new Product(106, "galletas marias", "55 g", 15);
        Product Product8 = new Product(107, "galletas   oreo", "30 g", 10);
        operacion opera = new operacion();
        //end of creation of objects

        //creation of ArrayList carslist
        ArrayList<Product> Productlist = new ArrayList<>();
        Productlist.add(Product1);
        Productlist.add(Product2);
        Productlist.add(Product3);
        Productlist.add(Product4);
        Productlist.add(Product5);
        Productlist.add(Product6);
        Productlist.add(Product7);
        Productlist.add(Product8);

        try {
            System.out.println("☻☺☻BIENVENIDO☻☺☻");
            System.out.println("\n-----------------------------\n");

            int condicionalsalir;
            int condicionalsalir2 = 0;
            do {
                condicionalsalir = 0;
                System.out.println("Te gustaria comprar algo.?\n");
                System.out.println("0-no\n");
                System.out.println("1-si\n\n▬►");
                option1 = scan.nextInt();

                if (option1 < 0 || option1 > 1) {
                    System.out.println("\n-----------------------------\n");
                    System.out.println("!♦ error, esta opcion no existe ♦!");
                    System.out.println("\n-----------------------------\n");
                    condicionalsalir = 1;
                }//end of if
                else {
                    switch (option1) {

                        case 0:

                            break;

                        case 1:
                            int condicionaldelcodigo;
                            System.out.println("\n\n-----------------------------\n");
                            System.out.println("Depocita tu dinero\n▬► $: \n");
                            dinero = scan.nextInt();

                            do {
                                do {
                                    int newcode = 0;
                                    condicionaldelcodigo = 0;
                                    System.out.println(Productlist);
                                    System.out.println("\n-----------------------------\n");
                                    System.out.println("tu credito es de: $" + dinero);
                                    System.out.println("\ncoloca aqui el codigo del producto que deseas comprar\n▬► codigo: \n");
                                    codigo = scan.nextInt();
                                    newcode = codigo - 100;

                                    if (codigo < 100 || codigo > 107) {
                                        System.out.println("\n-----------------------------\n");
                                        System.out.println("!!!!!!...♦el codigo: " + codigo + " no existe\nprueba nuevamente con otro...!!!");
                                        condicionaldelcodigo = 1;
                                        System.out.println("\n-----------------------------\n");
                                    }//end of the if
                                    else {
                                        int priceofaproduct = Productlist.get(newcode).getPriceProduct();

                                        if (priceofaproduct > dinero) {
                                            System.out.println("\n-----------------------------\n");
                                            System.out.println("♦♦no tienes suficiente dinero para comprar este producto♦♦\n");
                                            System.out.println("\n-----------------------------\n");
                                            condicionalsalir = 0;

                                            System.out.println("introduce mas dinero\n▬►");
                                            dinero2 = scan.nextInt();
                                            dinero = dinero + dinero2;
                                            repetircompra2 = 2;

                                        }//end of the if
                                        else {

                                            dinero = opera.resta(dinero, priceofaproduct);

                                            System.out.println("\n-----------------------------\n");
                                            System.out.println("\n☺☺☺!!..has comprado tu producto exitosamente..!!☺☺☺");
                                            System.out.println("tu cambio es de: $" + dinero + "\n\n");

                                            int repetircompra = 0;
                                            do {
                                                repetircompra2 = 0;
                                                repetircompra = 0;
                                                System.out.println("\n-----------------------------\n");
                                                System.out.println("quieres comprar otro producto?:\n");
                                                System.out.println("1--si\n");
                                                System.out.println("2--no\n\n▬►");
                                                condicionalsalir2 = scan.nextInt();

                                                if (condicionalsalir2 < 1 || condicionalsalir2 > 2) {
                                                    System.out.println("\n-----------------------------\n");
                                                    System.out.println("!♦ error, esta opcion no existe ♦!");
                                                    System.out.println("\n-----------------------------\n");
                                                    repetircompra = 1;
                                                }//end of if
                                                else {

                                                    switch (condicionalsalir2) {
                                                        case 1:
                                                            repetircompra2 = 2;
                                                            break;

                                                        case 2:

                                                            condicionalsalir = 0;
                                                            break;

                                                        default:
                                                    }//end of switch

                                                }//end of else
                                            } while (repetircompra == 1);

                                        }

                                    }//end of the else
                                } while (repetircompra2 == 2);
                            } while (condicionaldelcodigo == 1);

                            break;

                        default:
                    }//end of the switch

                }//end of the else

                if (option1 == 0) {
                    condicionalsalir = 0;
                }//end of if
                else {

                }//end of else
            } while (condicionalsalir == 1);
            System.out.println("\n-----------------------------\n");
            System.out.println("!!!!....::::♦Adios♦::::....!!!!");
            System.out.println("\n-----------------------------\n");

        } catch (Exception ex) {
            System.out.println("se ha producido una exepcion de tipo " + ex);

        }//end of the catch

    }

}
