/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Empleado;
import Model.Persona;
import Util.Lectura;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Alima
 */
public class GestionarEmpleados {
    ArrayList<Persona> listaPersonas;
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
    public void registrarPersona() {
        String dni, apellidos, nombres, sexo;
        int edad;
        double peso;
        Scanner entrada = new Scanner(System.in);
        System.out.print("DNI: ");
        dni = entrada.next();
        System.out.print("Apellidos: ");
        apellidos = entrada.next();
        System.out.print("Nombres: ");
        nombres = entrada.next();
        System.out.print("Sexo: ");
        sexo = entrada.next();
        System.out.print("Edad: ");
        edad = entrada.nextInt();
        System.out.print("Peso: ");
        peso = entrada.nextDouble();
        Persona persona = new Persona(dni, apellidos, nombres, sexo, edad, (float) peso);
        listaPersonas.add(persona); //Validar inserción , boolean 
    }

    public void buscarPersona() {
        String dni;
        int indice;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese DNI a buscar: ");
        dni = entrada.next();
        Persona persona = new Persona(dni);
        indice = listaPersonas.indexOf(persona);
        System.out.println("Estoy buscando una persona con dni=1"+indice);
        if (indice != -1) { //Lógica negativa.
            persona = listaPersonas.get(indice);
            System.out.println(persona);
        } else {
            System.out.println("La persona no se encuentra");
        }
    }
    
    public void buscarPersona(String basura) {
        String nombre, apellidos;
        int indice;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese los nombres: ");
        nombre = entrada.next();
        System.out.println("Ingrese los apellidos:");
        apellidos = entrada.next();
        Persona persona = new Persona(nombre, apellidos); //Errror, constructor nombre no definido 
        indice = listaPersonas.indexOf(persona);
        if (indice != -1) { //Lógica negativa.
            persona = listaPersonas.get(indice);
            System.out.println(persona);
        } else {
            System.out.println("La persona no se encuentra");
        }
    }


    public void eliminarPersona() {
        String dni;
        int indice;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese DNI para eliminar: ");
        dni = entrada.next();
        Persona persona = new Persona(dni);
        indice = listaPersonas.indexOf(persona);
        if (indice != -1) {
            persona = listaPersonas.remove(indice);
            System.out.println("Persona eliminada: " + persona);
        } else {
            System.out.println("La persona no se encuentra");
        }
    }
    
    public void eliminarPersonaNombre() {  
        String nombre, apellidos;
        int indice;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombre = entrada.next();
        System.out.print("Ingrese Los apellidos: ");
        apellidos = entrada.next();
        Persona persona = new Persona(nombre,apellidos);
        indice = listaPersonas.indexOf(persona);
        if (indice != -1) {
            persona = listaPersonas.remove(indice);
            System.out.println("Persona eliminada: " + persona);
        } else {
            System.out.println("La persona no se encuentra");
        }
    }

    public void mostrarPersonas() {
        if (listaPersonas.size() > 0) {
            for (Persona persona : listaPersonas) {
                System.out.println(persona);
            }
        } else {
            System.out.println("No existen personas registradas");
        }
    }

    public void ordenarPorApellido() {
        Collections.sort(listaPersonas, (Persona persona1, Persona persona2)
                -> persona1.getApellidos().compareTo(persona2.getApellidos()));
        mostrarPersonas();
    }
    
     public void ordenarPorNombre() {
        Collections.sort(listaPersonas, (Persona persona1, Persona persona2)
                -> persona1.getNombres().compareTo(persona2.getNombres()));
        mostrarPersonas();
    }
}
