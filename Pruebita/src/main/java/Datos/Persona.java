/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
//Crear mi propia excepcion, es la forma de gestionar un error o situacion que se puede presentar en ejecucion
//Que debe gestionarse de manera inteligente desde la programacion
//Buscamos a una persona en una coleccion de datos


/**
 *
 * @author Alima
 */
public class Persona {
    private String id;
    private String nombre;

    public Persona(String nombre, String id){
        this.nombre = nombre;
        this.id = id;
    }

    public String getIdentificacion(){
        return id;
    }
}
