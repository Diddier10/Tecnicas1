/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Cliente;
import Model.Empleado;
import Model.PlanEntrenamiento;
import Util.Lectura;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alima
 */
public class GestionarEmpleados {

    ArrayList<Empleado> listaEmpleados;
    ArrayList<Cliente> listaClientes;
    private Lectura lectura = new Lectura();

    public GestionarEmpleados(ArrayList<Cliente> listaClientes, ArrayList<PlanEntrenamiento> listaPlanes) {
        this.listaClientes = listaClientes;

    }


    public void mostrarClienteSeleccionado() {
        if (listaClientes.isEmpty()) {
            System.out.println("No existen personas registradas");
            return;
        }

        // Mostrar todos los clientes con número
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente c = listaClientes.get(i);
            System.out.println((i + 1) + ". " + c.getNombres() + " " + c.getApellidos());
        }
        Lectura lectura = new Lectura();
        int opcion = lectura.leerInt("Ingrese el numero en la lista del cliente que desea ver: ");

        if (opcion > 0 && opcion <= listaClientes.size()) {
            Cliente seleccionado = listaClientes.get(opcion - 1);
            System.out.println("===== INFORMACION DEL CLIENTE =====");
            System.out.println("Actividad Fisica: " + seleccionado.getActividadFisica());
            System.out.println("Peso: " + seleccionado.getPeso() + " kg");
            System.out.println("===================================");
        } else {
            System.out.println("Número inválido. Debe estar entre 1 y " + listaClientes.size());
        }
    }
}
