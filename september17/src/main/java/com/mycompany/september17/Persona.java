/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.september17;

/**
 *
 * @author Alima
 */
public class Persona {
    private String dni;
    private String apellidos;
    private String nombres;
    private String sexo;
    private int edad;
    private float peso;

    public Persona() {
    }

    public Persona(String dni) {
        this.dni = dni;
    }
    public Persona(String nombre, String apellido){
        
    }

    public Persona(String dni, String apellidos, String nombres, String sexo, int edad, float peso) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("dni=").append(dni);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", nombres=").append(nombres);
        sb.append(", sexo=").append(sexo);
        sb.append(", edad=").append(edad);
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }  
}
