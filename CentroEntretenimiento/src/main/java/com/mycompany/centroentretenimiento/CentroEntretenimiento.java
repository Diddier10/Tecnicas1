/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.centroentretenimiento;

import Model.*;
import Control.*;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Ali Garshasebie
 */
public class CentroEntretenimiento {
    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        GestionarCliente gc = new GestionarCliente(listaClientes);
        GestionFactura gf = new GestionFactura(listaClientes);
        menu(gc, gf);
    }

    public static void menu(GestionarCliente gc, GestionFactura gf) {
        int opcion;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("LISTA DE PERSONAS:");
            System.out.println("[1] Registrar clientes");
            System.out.println("[2] Verificar estado de cuenta");
            System.out.println("[3] Conocer a mis clientes como entrenador");
            System.out.println("[4] Consultar planes de entrenamiento de mis clientes");
            System.out.println("[5] Salir");
            System.out.print("Ingrese opción (1-5): ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    gc.crearCliente();
                    break;
                case 2:
                    gf.estadoDeuda();
                    break;
                case 3:
                    gc.mostrarClienteSeleccionado();
                    break;
                case 4:
                    gc.mostrarPlanesDeEntrenamiento();
                    break;
                case 5:
                    System.out.println("GRACIAS POR UTILIZAR NUESTRO SISTEMA.");
                    break;
            }
        } while (opcion != 5);
    }
}
/*public class CentroEntretenimiento {

    public static void menu(){
        int opcion;
        CentroEntretenimiento ce= new CentroEntretenimiento();
        Scanner entrada = new Scanner(System.in); //Cambiar por lectura desde la clase Lectura
        do {
            System.out.println("\nLISTA DE PERSONAS:");
            System.out.println("[1] Registrar clientes");
            System.out.println("[2] Verificar estado de cuenta");
            System.out.println("[3] Conocer a mis clientes como entrenador");
            System.out.println("[4] Consultar planes de entrenamiento de mis clientes");
            System.out.println("[5] Salir\n");
            /*System.out.println("[5] Eliminar persona por nombre");
            System.out.println("[6] Ordenar por apellidos");
            System.out.println("[7] Ordenar por nombre");
            System.out.println("[8] Mostrar persona");
            System.out.println("[9] Salir\n");
            System.out.print("Ingrese opcion (1-5): ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    //Cliente , para poder comparar Cliente con Cliente                  
                    gc.crearCliente();
                    break;
                case 2:
                    //Cliente , para poder comparar Cliente con Cliente
                    gf.estadoDeuda();
                    break;
                case 3:
                    gc.mostrarClienteSeleccionado();
                    break;
                case 4:
                    gc.mostrarPlanesDeEntrenamiento();
                    break;
                case 5:
                    System.out.println("GRACIAS POR UTILIZAR NUESTRO SISTEMA.");
                    break;
                /*case 6:
                    
                    break;
                case 7:
                 
                    break;
                case 8:
                 
                    break;
            }
        } while (opcion != 5);
    } 
    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes= new ArrayList<>();
        GestionarCliente gc = new GestionarCliente(listaClientes);
        GestionFactura gf = new GestionFactura(listaClientes);
        menu();
        
    }
}*/


