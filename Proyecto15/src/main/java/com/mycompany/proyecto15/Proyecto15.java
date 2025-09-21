/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto15;

/**
 *
 * @author Alima
 */
public class Proyecto15 {
   

    public static void main(String[] args) {
        System.out.println("Hello World!");
        BalonFutbol b1=new BalonFutbol(234, "Golty", 54);
        BalonBasket b2=new BalonBasket(23 ,"Cuero", 35);
        System.out.println(""+b1.toString());
        b1.Rebotable();
        b1.Chutable();
        b2.toString();
        b2.Chutable();
        b2.Rebotable();
    }
}
