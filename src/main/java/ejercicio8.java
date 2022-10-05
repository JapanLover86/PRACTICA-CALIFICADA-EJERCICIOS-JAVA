
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    //Un cliente realiza la siguiente compra de artefactos, plancha,
//licuadora, lavadora y cocina, si la compra supera los 1200, recibe un descuento
//de 17 %, mostrar el precio de cada artefacto, así como el monto, el descuento y
//el pago total si le corresponde un descuento
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
 
    System.out.println("Cantidad de productos :");
    int cantidad = sc.nextInt();
    
    System.out.println("PRODUCTOS: LAVADORA, LICUADORA, COCINA,PLANCHA ");
    int productos = sc.nextInt();
 
    System.out.print("Precio (producto): ");
    int precioUnitario=sc.nextInt();
 
    int importe = cantidad * precioUnitario; //importe SIN descuento
 
    System.out.println("\nCantidad de productos: " + cantidad);
    System.out.println("Precio unitario: " + precioUnitario);
    System.out.println("Importe base: " + importe);
 
    //Ahora veremos si se aplica algún descuento
    if (cantidad >= 0 && cantidad <= 1200) {
        System.out.println("\nDescuento aplicable: 0%");
        System.out.println("Importe con descuento: " + (importe * 1));
    }
    else if (cantidad >= 1200 && cantidad <= 0) {
        System.out.println("\nDescuento aplicable: 17%");
        System.out.println("Importe con descuento: " + (importe * 0.17));
    }
    
 
    sc.close(); //Cierre objeto Scanner
}}
