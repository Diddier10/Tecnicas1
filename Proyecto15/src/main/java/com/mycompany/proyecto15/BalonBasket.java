/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto15;

/**
 *
 * @author Alima
 */
public class BalonBasket extends Balon implements Manipulable {
    
    private String Material;

    public BalonBasket() {
    }

    public BalonBasket(String Material) {
        this.Material = Material;
    }

    public BalonBasket(double radio, String marca, int duracion) {
        super(radio, marca, duracion);
    }
    
    

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BalonBasket{");
        sb.append("Material=").append(Material);
        sb.append('}');
        return sb.toString();
    }
    @Override
    public void Rebotable(){
        System.out.println("Rebotar abajo de la cabeza");
    }
    @Override
    public void Chutable(){
        System.out.println("");
    }
    
}


