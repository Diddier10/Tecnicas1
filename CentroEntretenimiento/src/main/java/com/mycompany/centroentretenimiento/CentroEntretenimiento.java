/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.centroentretenimiento;

import Model.*;
import Control.GestionarProductos;
import Control.GestionarCliente;
import Control.GestionarServicios;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Ali Garshasebie
 */


public class CentroEntretenimiento {
    private static GestionarProductos gp = new GestionarProductos();
    static GestionarCliente gc = new GestionarCliente();
    private static GestionarServicios gh= new GestionarServicios();
    static ArrayList<Cliente> listaClientes = new ArrayList<>();
    static ArrayList<PlanEntrenamiento> listaPlanes = new ArrayList<>();
    
    public static void menu(){
        int opcion;
        CentroEntretenimiento ce= new CentroEntretenimiento();
        Scanner entrada = new Scanner(System.in); //Cambiar por lectura desde la clase Lectura
        do {
            System.out.println("\nLISTA DE PERSONAS:");
            System.out.println("[1] Registrar clientes");
            System.out.println("[2] Verificar estado de cuenta");
            //System.out.println("[2] Buscar persona por identificación");
            System.out.println("[3] Conocer a mis clientes como entrenador");
            System.out.println("[4] Consultar planes de entrenamiento de mis clientes");
            System.out.println("[5] Eliminar persona por nombre");
            System.out.println("[6] Ordenar por apellidos");
            System.out.println("[7] Ordenar por nombre");
            System.out.println("[8] Mostrar persona");
            System.out.println("[9] Salir\n");
            System.out.print("Ingrese opción (1-9): ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    //Cliente , para poder comparar Cliente con Cliente
                    
                    gc.crearCliente();
                    break;
                case 2:
                    //Cliente , para poder comparar Cliente con Cliente
                    gc.estadoDeuda(gc.crearCliente());
                    break;
                case 3:
                    //GestionarCliente entrenador = new GestionarCliente();
                    //entrenador.crearCliente();
                    gc.mostrarClienteSeleccionado();
                    //proyectoPersonas.buscarPersona();
                    //proyectoPersonas.buscarPersona("Hola");
                    break;
                case 4:
                   gc.mostrarPlanesDeEntrenamiento();
                    //proyectoPersonas.eliminarPersona();
                    break;
                case 5:
                    //proyectoPersonas.eliminarPersonaNombre();
                    break;
                case 6:
                    //proyectoPersonas.ordenarPorApellido();
                    break;
                case 7:
                    //proyectoPersonas.ordenarPorNombre();
                    break;
                case 8:
                    //proyectoPersonas.mostrarPersonas();
                    break;
            }
        } while (opcion != 9);
    } 
    public static void main(String[] args) {
        menu();
        //Cliente cliente= gc.crearCliente();
        //Servicio servicio= gh.crearServicio();
        
        
    }//Diddier
}


/*
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
            }
        } while (opcion != 9);
    }
*/