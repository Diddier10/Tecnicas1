/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Alima
 */
public class PlanEntrenamiento {
    private Cliente cliente;
    private String rutina;
    private int duraciónDias=30;

    public PlanEntrenamiento() {
    }

    public PlanEntrenamiento(Cliente cliente, String rutina) {
        this.cliente = cliente;
        this.rutina = rutina;
    }

    public PlanEntrenamiento(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getRutina() {
        return rutina;
    }

    public void setRutina(String rutina) {
        this.rutina = rutina;
    }

    public int getDuraciónDias() {
        return duraciónDias;
    }

    public void setDuraciónDias(int duraciónDias) {
        this.duraciónDias = duraciónDias;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlanEntrenamiento para:{").append(cliente.getNombres()).append("\nPeso: ").append(cliente.getPeso()).append("\nActividad física: ").append(cliente.getActividadFisica());
        sb.append("cliente=").append(cliente);
        sb.append(", rutina=").append(rutina);
        sb.append(", duraci\u00f3nDias=").append(duraciónDias);
        sb.append('}');
        return sb.toString();
    }
}
