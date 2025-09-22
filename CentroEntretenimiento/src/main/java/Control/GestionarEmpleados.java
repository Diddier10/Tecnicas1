/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Empleado;
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
    private Lectura lectura = new Lectura();
    public Empleado crearEmpleado(){
        Empleado empleado = new Empleado();
        System.out.println("A continuacion los datos del empleado:");
        empleado.setIdentificación(lectura.leerString("Identificacion:"));
        empleado.setNombres(lectura.leerString("Nombre"));
        empleado.setDirección(lectura.leerString("Telefono"));
        empleado.setTelefono(lectura.leerInt("Telefono"));
        empleado.setAntiguedad(lectura.leerInt("Numero de años en la empresa"));
        empleado.setCargo(lectura.leerString("Cargo en la empresa"));
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
    
    public void mostrarPersonas() {
        if (listaEmpleados.size() > 0) {
            for (Empleado empleado : listaEmpleados) {
                System.out.println(empleado);
            }
        } else {
            System.out.println("No existen empleados registrados");
        }
    }
    
    public void ordenarPorNombre() {
        Collections.sort(listaEmpleados, (Empleado empleado1, Empleado empleado2)
                 -> persona1.getNombres().compareTo(persona2.getNombres()));
        mostrarPersonas();
    }    
}
