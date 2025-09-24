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
import java.util.Scanner;

/**
 *
 * @author Alimateo Garshasebi
 */
public class GestionarCliente {
    ArrayList<Cliente> listaClientes;
    ArrayList<PlanEntrenamiento> listaPlanes;
    private Lectura lectura = new Lectura();
    Persona persona= new Persona();
    public GestionarCliente(ArrayList<Cliente> listaClientes, ArrayList<PlanEntrenamiento> listaPlanes) {
        this.listaClientes = listaClientes;
        this.listaPlanes=listaPlanes;
    }
    public Cliente crearCliente(){
        Cliente cliente = new Cliente();
        System.out.println("A continuacion los datos del cliente:");
        cliente.setIdentificación(lectura.leerString("Identificacion:"));
        cliente.setNombres(lectura.leerString("Nombre:"));
        cliente.setApellidos(lectura.leerString("Apellido:"));
        cliente.setDirección(lectura.leerString("Direccion:"));
        cliente.setTelefono(lectura.leerInt("Telefono:"));
        cliente.setEstratoSE(lectura.leerInt("Estrato:"));
        cliente.setTrabajaEn(lectura.leerString("Donde trabajas actualmente?: "));
        cliente.setPeso(lectura.leerFloat("Peso:"));
        cliente.setPlanEntrenamiento(lectura.leerString("Que plan de entrenamiento sigues hasta hoy?:"));
        cliente.setMesActual(lectura.leerString("Mes de registro en formato de numero: Enero(01), Febrero(02)...:"));
        cliente.setPracticaActividadFisica(lectura.leerBoolean("Realiza actividad fisica? (Si/No):"));
        cliente.setActividadFisica(lectura.leerString("Que tipo de Actividad fisica realiza?: "));
        cliente.setCantidadAFMinutos(lectura.leerInt("Si realiza actividad fisica, Cuantos minutos a la semana?:"));
        listaClientes.add(cliente);
        PlanEntrenamiento plan = new PlanEntrenamiento(cliente); // Usa la info del cliente para el plan
        //planesPorCliente.put(cliente, plan);
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
}

//EqualsignoreCase solamente funciona entre String 