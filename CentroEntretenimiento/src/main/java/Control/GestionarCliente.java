/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Util.Lectura;
import Model.Cliente;
import Model.Persona;
import Model.PlanEntrenamiento;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Alimateo Garshasebi
 */
public class GestionarCliente {
    ArrayList<Cliente> listaClientes= new ArrayList<>();
    private Map<Cliente, PlanEntrenamiento> planesPorCliente = new HashMap<>();
    ArrayList<Cliente> listaClientes1 = new ArrayList<>();
    ArrayList<PlanEntrenamiento> listaPlanes = new ArrayList<>();
    private Lectura lectura = new Lectura();
    Persona persona= new Persona();
    public Cliente crearCliente(){
        Cliente cliente = new Cliente();
        System.out.println("A continuacion los datos del cliente:");
        cliente.setIdentificación(lectura.leerString("Identificacion:"));
        cliente.setNombres(lectura.leerString("Nombre:"));
        cliente.setApellidos(lectura.leerString("Apellido:"));
        cliente.setDirección(lectura.leerString("Direccion:"));
        cliente.setTelefono(lectura.leerInt("Telefono:"));
        cliente.setEstratoSE(lectura.leerInt("Estrato:"));
        cliente.setPeso(lectura.leerFloat("Peso:"));
        cliente.setMesActual(lectura.leerString("Mes de registro"));
        cliente.setPracticaActividadFisica(lectura.leerBoolean("Realiza actividad fisica? (Si/No):"));
        cliente.setActividadFisica(lectura.leerString("Que tipo de Actividad fisica realiza?: "));
        cliente.setCantidadAFMinutos(lectura.leerInt("Si realiza actividad fisica, Cuantos minutos a la semana?:"));
        listaClientes.add(cliente);
        PlanEntrenamiento plan = new PlanEntrenamiento(cliente); // Usa la info del cliente para el plan
        planesPorCliente.put(cliente, plan);
        listaPlanes.add(plan);
        return cliente;
    }
    /*public Cliente crearCliente(String mensaje){
        Cliente cliente = new Cliente();
        System.out.println(mensaje);
        cliente.setIdentificación(lectura.leerString("Identificación: "));
        listaClientes.add(cliente);
        return cliente;
    }*/
    public void buscarCliente() {
        String identificacion;
        int indice;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese DNI a buscar: ");
        identificacion = entrada.next();
        Cliente cliente = new Cliente(identificacion);
        indice = listaClientes.indexOf(cliente);
        System.out.println("Estoy buscando una persona con dni=1"+indice);
        if (indice != -1) { //Lógica negativa.
            persona = listaClientes.get(indice);
            System.out.println(persona);
        } else {
            System.out.println("La persona no se encuentra");
        }
    }
    
    public void buscarCliente(String basura) {
        String nombres, apellidos;
        int indice;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese los nombres: ");
        nombres = entrada.next();
        System.out.println("Ingrese los apellidos:");
        apellidos = entrada.next();
        Cliente cliente = new Cliente(nombres, apellidos); //Errror, constructor nombre no definido 
        indice = listaClientes.indexOf(persona);
        if (indice != -1) { //Lógica negativa.
            persona = listaClientes.get(indice);
            System.out.println(persona);
        } else {
            System.out.println("La persona no se encuentra");
        }
    }
    
    public void eliminarCliente() {
        String identificación;
        int indice;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese identificacion para eliminar: ");
        identificación = entrada.next();
        Cliente cliente = new Cliente(identificación);
        indice = listaClientes.indexOf(persona);
        if (indice != -1) {
            persona = listaClientes.remove(indice);
            System.out.println("Persona eliminada: " + persona);
        } else {
            System.out.println("La persona no se encuentra");
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
    public void mostrarClienteSeleccionado() {
        if (listaClientes.isEmpty()) {
            System.out.println("No existen personas registradas");
            return;
        }
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente c = listaClientes.get(i);
            System.out.println((i + 1) + ". " + c.getNombres() + " " + c.getApellidos());
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero en la lista del cliente que desea ver: ");
        int opcion = sc.nextInt();
        if (opcion > 0 && opcion <= listaClientes.size()) {
            Cliente seleccionado = listaClientes.get(opcion-1);
            System.out.println("===== INFORMACION DEL CLIENTE =====");
            System.out.println("Actividad Fisica: " + seleccionado.getActividadFisica());
            System.out.println("Peso: " + seleccionado.getPeso() + " kg");
            System.out.println("==================================");
        } else {
            System.out.println("Número inválido.");
        }
    }
     
    public void estadoDeuda() {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese identificacion para buscar: ");
    String identificacion = entrada.nextLine();
    Cliente clienteEncontrado = null;
    for (Cliente c : listaClientes) {
        if (c.getIdentificación().equals(identificacion)) {
            clienteEncontrado = c;
            break;
        }
    }
    if (clienteEncontrado == null) {
        System.out.println("Cliente con identificacion " + identificacion + " no fue encontrado.");
    } else {
        System.out.print("Ingrese el mes a consultar: ");
        String mes = entrada.nextLine();
        System.out.println("\nEstado de cuenta de: "+ clienteEncontrado.getNombres() + " "+ clienteEncontrado.getApellidos());
        if (clienteEncontrado.getMesActual().equalsIgnoreCase(mes)) {
            if (clienteEncontrado.getDeuda() > 0) {
                System.out.println("Mes: " + mes);
                System.out.println("Deuda actual: $" + clienteEncontrado.getDeuda());
                System.out.println("No tiene derecho al gimnasio hasta pagar la deuda.");
            } else {
                System.out.println("Mes: " + mes);
                System.out.println("Está al día con los pagos.");
                System.out.println("Tiene derecho al gimnasio.");
            }
        } else {
            System.out.println("En el mes " + mes + " no tiene deuda registrada.");
        }
    }
}

    public void mostrarPlanesDeEntrenamiento() {
    if (listaClientes.isEmpty()) {
        System.out.println("No hay clientes registrados.");
        return;
    }
    for (int i = 0; i < listaClientes.size(); i++) {
        Cliente c = listaClientes.get(i);
        PlanEntrenamiento plan = listaPlanes.get(i);
        System.out.println("Cliente: " + c.getNombres() + " " + c.getApellidos());
        System.out.println("===== PLAN DE ENTRENAMIENTO =====");
        System.out.println("""
                           ESTE PLAN SE REPETIRA SOLAMENTE POR 4 SEMANAS
                           Dia 1: Cardio intenso (30 minutos)
                           Dia 2: Piernas y gluteos (sentadillas, lunges, peso muerto)
                           Dia 3: Pecho y triceps (flexiones, fondos, press con mancuernas)
                           Dia 4: Espalda y biceps (dominadas, remo con mancuerna)
                           Dia 5: Core (abdominales, plancha, mountain climbers)
                           Dia 6: Cardio + fuerza (circuito de saltos, burpees, sentadillas)
                           Dia 7: Estiramientos y recuperacion activa (yoga, caminata suave)""");
        }
        System.out.println("-----------------------------------------------------------------");
    }
}

//EqualsignoreCase solamente funciona entre String 