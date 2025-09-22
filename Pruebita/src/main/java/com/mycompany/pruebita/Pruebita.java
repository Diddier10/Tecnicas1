/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pruebita;
import Excepcione.PersonaNotFoundException ;
import Datos.Persona ;
import CapaDAO.PersonaDAO ;
/**
 *
 * @author Alima
 */
public class Pruebita {

        public static void main(String[] argumentos) {
            Persona[] personas = new Persona[5];
            personas[0] = new Persona("Alejandro", "71211368");
            personas[1] = new Persona("Diana", "71211369");
            personas[2] = new Persona("Aleo", "71211360");
            personas[3] = new Persona("Pepe", "71211365");
            personas[4] = new Persona("Luis", "71211363");

            try {
                Persona encontrada = PersonaDAO.buscarPersona(personas, "71211368");
                System.out.println("Lo encontre");
            } catch (PersonaNotFoundException pf) {
                System.out.println("Mensaje de error" + pf);
            } finally { //Siempre se va a ejecutar apesar de todo
                System.out.println("Bloque pase o no pase error");
            }

        }
}
