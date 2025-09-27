/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Util.Lectura;
import Model.Cliente;
import Model.PlanEntrenamiento;
import java.util.ArrayList;

/**
 *
 * @author Alimateo Garshasebi
 */
public class GestionarCliente {

    ArrayList<Cliente> listaClientes;
    ArrayList<PlanEntrenamiento> listaPlanes;
    Lectura lectura = new Lectura();
    public GestionarCliente(ArrayList<Cliente> listaClientes, ArrayList<PlanEntrenamiento> listaPlanes) {
        this.listaClientes = listaClientes;
        this.listaPlanes = listaPlanes;
    }

    public Cliente crearCliente() {
        Cliente cliente = new Cliente();
        System.out.println("A continuacion los datos del cliente:");
        cliente.setIdentificación(lectura.leerString("Identificacion:"));
        cliente.setNombres(lectura.leerString("Nombre:"));
        cliente.setApellidos(lectura.leerString("Apellido:"));
        cliente.setDirección(lectura.leerString("Direccion:"));
        cliente.setTelefono(lectura.leerInt("Telefono:"));
        cliente.setEstratoSE(lectura.leerInt("Estrato:"));
        cliente.setPeso(lectura.leerFloat("Peso:"));
        cliente.setTrabajaEn(lectura.leerString("Donde trabajas actualmente?: "));
        cliente.setPlanEntrenamiento(lectura.leerString("Que plan de entrenamiento sigues hasta hoy?:"));
        cliente.setMesActual(lectura.leerString("Mes de registro:"));
        boolean realizaActividad = lectura.leerBoolean("Realiza actividad fisica? (Si/No): ");
        cliente.setPracticaActividadFisica(realizaActividad);
        if (realizaActividad) {
            String tipoActividad = lectura.leerString("¿Que tipo de actividad fisica realiza?: ");
            int minutos = lectura.leerInt("Cuantos minutos a la semana?: ");
            cliente.setActividadFisica(tipoActividad);
            cliente.setCantidadAFMinutos(minutos);
        } else {
            cliente.setActividadFisica("Ninguna");
            cliente.setCantidadAFMinutos(0);
        }
        listaClientes.add(cliente);
        PlanEntrenamiento plan = new PlanEntrenamiento(cliente);
        listaPlanes.add(plan);
        return cliente;
    }

    public void buscarCliente() {
        if (listaClientes.isEmpty()) {
            System.out.println("No existen clientes registrados.");
            return;
        }

        String identificacion = lectura.leerString("Ingrese la identificacion del cliente que desea buscar: ");

        Cliente clienteEncontrado = null;

        for (Cliente c : listaClientes) {
            if (c.getIdentificación().equalsIgnoreCase(identificacion)) {
                clienteEncontrado = c;
                break;
            }
        }

        if (clienteEncontrado != null) {
            System.out.println("\nCliente encontrado:");
            System.out.println("Nombre: " + clienteEncontrado.getNombres() + " " + clienteEncontrado.getApellidos());
            System.out.println("Identificacion: " + clienteEncontrado.getIdentificación());
            System.out.println("Actividad fisica: " + clienteEncontrado.getActividadFisica());
            System.out.println("Peso: " + clienteEncontrado.getPeso() + " kg");
            System.out.println("Mes actual: " + clienteEncontrado.getMesActual());
            System.out.println("Deuda: $" + clienteEncontrado.getDeuda());
        } else {
            System.out.println("No se encontro ningun cliente con la identificacion: " + identificacion);
        }
    }

    public void eliminarCliente() {
        if (listaClientes.isEmpty()) {
            System.out.println("No existen clientes registrados.");
            return;
        }

        String identificacion = lectura.leerString("Ingrese la identificacion del cliente que desea eliminar: ");

        Cliente clienteAEliminar = null;

        for (Cliente c : listaClientes) {
            if (c.getIdentificación().equalsIgnoreCase(identificacion)) {
                clienteAEliminar = c;
                break;
            }
        }

        if (clienteAEliminar != null) {
            System.out.println("\nCliente encontrado:");
            System.out.println("Nombre: " + clienteAEliminar.getNombres() + " " + clienteAEliminar.getApellidos());
            System.out.println("Actividad fisica: " + clienteAEliminar.getActividadFisica());
            System.out.println("Peso: " + clienteAEliminar.getPeso() + " kg");

            boolean confirmar = lectura.leerBoolean("Esta seguro de que desea eliminar a este cliente? (Si/No): ");
            if (confirmar) {
                listaClientes.remove(clienteAEliminar);
                System.out.println("Cliente eliminado exitosamente.");
            } else {
                System.out.println("Operacion cancelada. El cliente no fue eliminado.");
            }
        } else {
            System.out.println("No se encontro ningun cliente con la identificacion: " + identificacion);
        }
    }

    public void mostrarClientes() {
        if (!listaClientes.isEmpty()) {
            for (Cliente cliente : listaClientes) {
                System.out.println(cliente);
            }
        } else {
            System.out.println("No existen personas registradas");
        }
    }
}

//EqualsignoreCase solamente funciona entre String 
