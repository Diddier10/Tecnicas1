/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Control;

import java.util.Scanner;

/**
 * permite compartir comportamientos entre otras clases
 * Constantes 
 * Metdodos
 * templates o cascarones, prefacs, moldes para compartir comportamientos
 * 
 * @author Alima
 */
public interface Pago {
    String pagoEfectivo(Scanner sc);
    String pagoCheque(Scanner sc);
    String pagoTarjeta(Scanner sc);
}
