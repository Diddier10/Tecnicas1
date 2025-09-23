/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author Alima
 */
public class Cliente extends Persona {
    private int estratoSE;
    private String trabajaEn;
    private Boolean practicaActividadFisica;
    private String actividadFisica;
    private int cantidadAFMinutos;
    private String planEntrenamiento;
    private int tiempoPlan;
    private double deuda;
    private PlanEntrenamiento planentrenamiento;
    private String mesActual;
    public Cliente() {
    }

    public Cliente(int estratoSE, String trabajaEn, Boolean practicaActividadFisica, String actividadFisica, int cantidadAFMinutos, String planEntrenamiento, int tiempoPlan, double deuda) {
        this.estratoSE = estratoSE;
        this.trabajaEn = trabajaEn;
        this.practicaActividadFisica = practicaActividadFisica;
        this.actividadFisica = actividadFisica;
        this.cantidadAFMinutos = cantidadAFMinutos;
        this.planEntrenamiento = planEntrenamiento;
        this.tiempoPlan = tiempoPlan;
        this.deuda = deuda;
    }

    public Cliente( String nombres, String apellidos) {
        super( apellidos, nombres);
    }

    public Cliente(String identificación) {
        super(identificación);
    }

    public int getEstratoSE() {
        return estratoSE;
    }

    public void setEstratoSE(int estratoSE) {
        this.estratoSE = estratoSE;
    }

    public String getTrabajaEn() {
        return trabajaEn;
    }

    public void setTrabajaEn(String trabajaEn) {
        this.trabajaEn = trabajaEn;
    }

    public Boolean getPracticaActividadFisica() {
        return practicaActividadFisica;
    }

    public void setPracticaActividadFisica(Boolean practicaActividadFisica) {
        this.practicaActividadFisica = practicaActividadFisica;
    }

    public String getActividadFisica() {
        return actividadFisica;
    }

    public void setActividadFisica(String actividadFisica) {
        this.actividadFisica = actividadFisica;
    }

    public int getCantidadAFMinutos() {
        return cantidadAFMinutos;
    }

    public void setCantidadAFMinutos(int cantidadAFMinutos) {
        this.cantidadAFMinutos = cantidadAFMinutos;
    }

    public String getPlanEntrenamiento() {
        return planEntrenamiento;
    }

    public void setPlanEntrenamiento(String planEntrenamiento) {
        this.planEntrenamiento = planEntrenamiento;
    }

    public int getTiempoPlan() {
        return tiempoPlan;
    }

    public void setTiempoPlan(int tiempoPlan) {
        this.tiempoPlan = tiempoPlan;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public PlanEntrenamiento getPlanentrenamiento() {
        return planentrenamiento;
    }

    public void setPlanentrenamiento(PlanEntrenamiento planentrenamiento) {
        this.planentrenamiento = planentrenamiento;
    }

    public String getMesActual() {
        return mesActual;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("estratoSE=").append(estratoSE);
        sb.append(", trabajaEn=").append(trabajaEn);
        sb.append(", practicaActividadFisica=").append(practicaActividadFisica);
        sb.append(", actividadFisica=").append(actividadFisica);
        sb.append(", cantidadAFMinutos=").append(cantidadAFMinutos);
        sb.append(", planEntrenamiento=").append(planEntrenamiento);
        sb.append(", tiempoPlan=").append(tiempoPlan);
        sb.append(", deuda=").append(deuda);
        sb.append('}');
        return sb.toString();
    }   

    public void setMesActual(String mesActual) {
        this.mesActual = mesActual;
    }
}   
    
    
    
    

