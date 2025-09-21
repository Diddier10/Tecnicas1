/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto15;

/**
 *
 * @author Alima
 */
public class Balon {
    private double radio;
    private String marca;
    private int duracion;

    public Balon() {
    }

    public Balon(double radio, String marca, int duracion) {
        this.radio = radio;
        this.marca = marca;
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    

    @Override
    public String toString() {
        return "Balon{" + "radio=" + radio + ", marca=" + marca + ", duracion=" + duracion + '}';
    }
    
}
