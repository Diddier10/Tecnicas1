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
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Alima
 */
public class GestionarEmpleados {
    ArrayList<Empleado> listaEmpleados;
    ArrayList<Cliente> listaClientes;
    ArrayList<PlanEntrenamiento> listaPlanes;
    private Lectura lectura = new Lectura();
    public GestionarEmpleados(ArrayList<Cliente> listaClientes, ArrayList<PlanEntrenamiento> listaPlanes){
       this.listaClientes=listaClientes;
       this.listaPlanes=listaPlanes;
               
    }
    public Empleado crearEmpleado(){
        Empleado empleado = new Empleado();
        System.out.println("A continuacion los datos del empleado:");
        empleado.setIdentificación(lectura.leerString("Identificacion:"));
        empleado.setNombres(lectura.leerString("Nombre"));
        empleado.setDirección(lectura.leerString("Telefono"));
        empleado.setTelefono(lectura.leerInt("Telefono"));
        empleado.setAntiguedad(lectura.leerInt("Numero de años en la empresa"));
        empleado.setCargo(lectura.leerString("Cargo en la empresa"));
        listaEmpleados.add(empleado);
        return empleado;
    }
    
    public void eliminarEmpleado() {
        String identificacion ;
        int indice;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese identificacion para eliminar: ");
        identificacion = entrada.next();
        Empleado empleado = new Empleado(identificacion);
        indice = listaEmpleados.indexOf(empleado);
        if (indice != -1) {
            empleado = listaEmpleados.remove(indice);
            System.out.println("Empleado eliminada: " + empleado);
        } else {
            System.out.println("El empleado no se encuentra");
        }
    }
    
    public void mostrarEmpleados() {
        if (!listaEmpleados.isEmpty()) {
            for (Empleado empleado : listaEmpleados) {
                System.out.println(empleado);
            }
        } else {
            System.out.println("No existen empleados registrados");
        }
    }
    
    public void ordenarPorNombre() {
        Collections.sort(listaEmpleados, (Empleado empleado1, Empleado empleado2)
                 -> empleado1.getNombres().compareTo(empleado2.getNombres()));
        mostrarEmpleados();
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
    /*public Cliente entrenadorCliente(){
        
    }*/
}
