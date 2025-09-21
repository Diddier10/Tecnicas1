/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.september17;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Objects;


/**
 *
 * @author margot.lopez
 */
public class ProyectoPersona {
//Se tiene la siguiente información de n personas: dni, apellidos, nombres, sexo, edad y peso. Esta información se tiene que registrar en un ArrayList, buscar una persona dado el dni, eliminar una persona, ordenar por apellidos y mostrar todas las personas. Hacer un menú para realizar lo que se pide.

    ArrayList<Persona> listaPersonas;

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


