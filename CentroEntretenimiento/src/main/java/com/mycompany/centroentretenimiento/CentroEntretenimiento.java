/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.centroentretenimiento;

import Model.*;
import Control.*;
import Util.Lectura;
import java.util.ArrayList;

/**
 *
 * @author Ali Garshasebie
 */
public class CentroEntretenimiento {

    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<PlanEntrenamiento> listaPlanes = new ArrayList<>();
        ArrayList<Factura> listaFactura = new ArrayList<>();
        Empleado cajero = new Empleado(2000000, 3, "Cajero");
        GestionarCliente gc = new GestionarCliente(listaClientes, listaPlanes);
        GestionFactura gf = new GestionFactura(listaClientes, listaPlanes, listaFactura);
        GestionarEmpleados ge = new GestionarEmpleados(listaClientes, listaPlanes);
        GestionarServicios gs = new GestionarServicios(listaClientes, listaPlanes);
        menu(gc, gf, ge, gs, cajero);
    }

    public static void menu(GestionarCliente gc, GestionFactura gf, GestionarEmpleados ge, GestionarServicios gs, Empleado cajero) {
        int opcion;
        Lectura lectura = new Lectura();
        do {
            System.out.println("LISTA DE PERSONAS:");
            System.out.println("[1] Registrar cliente");
            System.out.println("[2] Verificar estado de cuenta");
            System.out.println("[3] Conocer a mis clientes como entrenador");
            System.out.println("[4] Consultar planes de entrenamiento de mis clientes como entrenador");
            System.out.println("[5] Mostrar cliente");
            System.out.println("[6] Buscar cliente");
            System.out.println("[7] Eliminar cliente");
            System.out.println("[8] Crear factura");
            System.out.println("[9] Arqueo de caja");
            System.out.println("[10] Salir del sistema");
            opcion = lectura.leerInt("Ingrese una opcion (1-10): ");
            switch (opcion) {
                case 1 -> gc.crearCliente();
                case 2 -> gf.estadoDeuda();
                case 3 -> ge.mostrarClienteSeleccionado();
                case 4 -> gs.mostrarPlanesDeEntrenamiento();
                case 5 -> gc.mostrarClientes();
                case 6 -> gc.buscarCliente();
                case 7 -> gc.eliminarCliente();
                case 8 -> {
                    Cliente clienteFactura = gf.estadoDeuda();
                    if (clienteFactura == null) {
                        System.out.println("Cliente no encoontrado. No se puede generar la factura");
                        break;
                    }
                    gf.crearFactura(clienteFactura, cajero);
                }
                case 9 -> gf.arqueoCaja();
                case 10 -> System.out.println("GRACIAS POR UTILIZAR NUESTRO SISTEMA");
            }
        } while (opcion != 10);
    }
}
