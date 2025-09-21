/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto15;

/**
 *
 * @author Alima
 */
public class BalonFutbol extends Balon implements Manipulable {
    
    private double CantidadHexagono;

    public BalonFutbol() {
    }

    public BalonFutbol(double CantidadHexagono) {
        this.CantidadHexagono = CantidadHexagono;
    }

    public BalonFutbol(double radio, String marca, int duracion) {
        super(radio, marca, duracion);
    }
    
    

    public double getCantidadHexagono() {
        return CantidadHexagono;
    }

    public void setCantidadHexagono(double CantidadHexagono) {
        this.CantidadHexagono = CantidadHexagono;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BalonFutbol{");
        sb.append("CantidadHexagono=").append(CantidadHexagono);
        sb.append('}');
        return sb.toString()+super.toString();
    }
    @Override
    public void Chutable(){
        System.out.println("Patear con más fuerza");  
    }
    @Override
    public void Rebotable(){
        System.out.println("");
    }
    
    
    
    
}
