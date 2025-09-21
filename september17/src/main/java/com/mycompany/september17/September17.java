/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.september17;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alima
 */
public class September17 {

    public static void main(String[] args) {
        int opcion;
        ProyectoPersona proyectoPersonas = new ProyectoPersona();
        proyectoPersonas.listaPersonas = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("\nLISTA DE PERSONAS:");
            System.out.println("[1] Registrar persona");
            System.out.println("[2] Buscar persona por DNI");
            System.out.println("[3] Buscar persona por nombre y apellidos");
            System.out.println("[4] Eliminar persona");
            System.out.println("[5] Eliminar persona por nombre");
            System.out.println("[6] Ordenar por apellidos");
            System.out.println("[7] Ordenar por nombre");
            System.out.println("[8] Mostrar persona");
            System.out.println("[9] Salir\n");
            System.out.print("Ingrese opción (1-9): ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    proyectoPersonas.registrarPersona();
                    break;
                case 2:
                    proyectoPersonas.buscarPersona();
                    break;
                case 3:
                    proyectoPersonas.buscarPersona("Hola");
                    break;
                case 4:
                    proyectoPersonas.eliminarPersona();
                    break;
                case 5:
                    proyectoPersonas.eliminarPersonaNombre();
                    break;
                case 6:
                    proyectoPersonas.ordenarPorApellido();
                    break;
                case 7:
                    proyectoPersonas.ordenarPorNombre();
                    break;
                case 8:
                    proyectoPersonas.mostrarPersonas();
                    break;
                case 9:
                    System.out.println("Gracias, vuelva pronto");
                    break;
              }
          } while (opcion != 9);
    }
}
