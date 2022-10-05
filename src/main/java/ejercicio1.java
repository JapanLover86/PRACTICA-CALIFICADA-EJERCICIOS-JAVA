/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    //EMPLEANDO ARREGLOS MOSTRAR N PRODUCTOS CON SUS RESPECTIVOS PRECIOS
    public static void main(String[] args) {
        // TODO code application logic here
        String utiles []={"pelota", "zapatilla","mochila","polo"};
        double precios[]={35.5,89.60,45.99,25.70};
        System.out.println("Lista de Productos y sus precios");
           for (int u=0;u<utiles.length;u++){
        System.out.println(utiles[u]+ " "+ precios[u]);
}
}
}
