/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Cliente;
import Model.Servicio;
import Util.Lectura;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Ali
 */
public class GestionarServicios {
    ArrayList<Servicio> listaServicios= new ArrayList<>();
    private Lectura lectura = new Lectura();
    Servicio servicio= new Servicio(); 
    public Servicio crearServicio(){
        Servicio servicio= new Servicio();
        System.out.println("A continuación ingrese los datos del Servicio.");
        servicio.setCodigo(lectura.leerInt("Ingrese el codigo:"));
        servicio.setNombres(lectura.leerString("Nombre: "));
        servicio.setDescripción(lectura.leerString("Descripción: "));
        return servicio;
    
    }
    /*public void registrarServicio() {
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
        Servicio servicio = new Servicio(dni, apellidos, nombres, sexo, edad, (float) peso);
        
    //Validar inserción , boolean 
    }

    public void buscarServicio() {
        String dni;
        int indice;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese DNI a buscar: ");
        dni = entrada.next();
        Servicio servicio = new Servicio(dni);
        indice = listaServicios.indexOf(servicio);
        System.out.println("Estoy buscando una persona con dni=1"+indice);
        if (indice != -1) { //Lógica negativa.
            servicio = listaServicios.get(indice);
            System.out.println(servicio);
        } else {
            System.out.println("La persona no se encuentra");
        }
    }
    
    public void buscarServicio(String basura) {
        String nombre, apellidos;
        int indice;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese los nombres: ");
        nombre = entrada.next();
        System.out.println("Ingrese los apellidos:");
        apellidos = entrada.next();
        Servicio servicio = new Servicio(nombre, apellidos); //Errror, constructor nombre no definido 
        indice = listaServicios.indexOf(servicio);
        if (indice != -1) { //Lógica negativa.
            servicio = listaServicios.get(indice);
            System.out.println(servicio);
        } else {
            System.out.println("La persona no se encuentra");
        }
    }


    public void eliminarServicio() {
        String dni;
        int indice;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese DNI para eliminar: ");
        dni = entrada.next();
        Servicio servicio = new Servicio(dni);
        indice = listaServicios.indexOf(servicio);
        if (indice != -1) {
            servicio = listaServicios.remove(indice);
            System.out.println("Persona eliminada: " + servicio);
        } else {
            System.out.println("La persona no se encuentra");
        }
    }

    public void mostrarServicios() {
        if (listaServicios.size() > 0) {
            for (Servicio servicio : listaServicios) {
                System.out.println(servicio);
            }
        } else {
            System.out.println("No existen personas registradas");
        }
    }
 
    public void ordenarServicioPorNombre() {
        Collections.sort(listaServicios, (Servicio persona1, Servicio persona2)
                -> persona1.getNombres().compareTo(persona2.getNombres()));
        mostrarServicios();
    }*/
   
}