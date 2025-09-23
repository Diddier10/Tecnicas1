/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.util.*;

/**
 *
 * @author Ali
 */
/*public class Lectura {
    private Scanner entrada = new Scanner(System.in);
    
    public int leerInt(String mensaje){
        System.out.println(""+mensaje);
        return entrada.nextInt();
    }

    public String leerString(String mensaje){
        System.out.println(""+mensaje);
        return entrada.nextLine();
    }
    
    public float leerFloat(String mensaje){
        System.out.println(""+mensaje);
        return entrada.nextFloat();
    }
    public Boolean leerBoolean(String mensaje){
        System.out.println(""+mensaje);
        return entrada.hasNextBoolean();
    }
}*/


public class Lectura {
    private Scanner entrada = new Scanner(System.in);

    // Leer un número entero (por ejemplo estrato)
    public int leerInt(String mensaje) {
        int valor = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                String texto = entrada.nextLine();  // leemos todo como texto
                valor = Integer.parseInt(texto);   // convertimos a número
                valido = true;  // si llega aquí, no hubo error
            } catch (NumberFormatException e) {
                System.out.println("️Por favor ingrese un numero valido.");
            }
        }
        return valor;
    }

    // Leer texto (nombre, dirección, etc.)
    public String leerString(String mensaje) {
        System.out.println(mensaje);
        return entrada.nextLine();  // aquí no hay conversión, solo texto
    }

    // Leer un número decimal (por ejemplo peso, estatura en metros)
    public float leerFloat(String mensaje) {
        float valor = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                String texto = entrada.nextLine();
                valor = Float.parseFloat(texto);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("️ Por favor ingrese un numero decimal valido (use punto, no coma).");
            }
        }
        return valor;
    }

    // Leer respuesta de tipo S/N y devolver true o false
    public Boolean leerBoolean(String mensaje) {
        while (true) {
            System.out.println(mensaje);
            String texto = entrada.nextLine().trim().toLowerCase();

            if (texto.equals("s") || texto.equals("si")) {
                return true;
            } else if (texto.equals("n") || texto.equals("no")) {
                return false;
            }

            System.out.println("️ Por favor responda con Si o No.");
        }
    }
}
