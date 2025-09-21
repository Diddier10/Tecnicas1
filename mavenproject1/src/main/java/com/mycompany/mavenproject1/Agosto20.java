/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;


/**
 *@version 1.0.0
 * @author Ali
 */
public class Agosto20 {
    public static int leerInt(){
        int dato=0;
        Scanner entrada = new Scanner(System.in);  
        dato = entrada.nextInt();
        return dato;  
    }
   
    public static String leerString(){
        String dato="";
        Scanner entrada = new Scanner(System.in);  
        dato = entrada.nextLine();
        return dato;
    }
   
    public static double sumar(double n1, double n2){
        return(n1+n2);
    }
    public static double promedio(double valor, double cantidad){
        return (valor/cantidad);
    }
   
    public static void main(String[] args) {
        int edad;
        int edad2;
        String nombre;
        System.out.println("Recepción de hojas de vida");
        System.out.print("Ingrese su edad: ");
        edad=leerInt();
        System.out.println(""+edad);
        System.out.println("Ingrese sus nombre: ");
        nombre=leerString();
        System.out.println(""+nombre);  
        System.out.println("Ingrese la edad de su pareja: ");
        edad2 = leerInt();
        System.out.println(""+edad2);
        System.out.println("La suma de las edades es: "+sumar(edad,edad2));
        System.out.println("El promedio de las edades es: "+promedio(sumar(edad,edad2),2));
    }
}
    
