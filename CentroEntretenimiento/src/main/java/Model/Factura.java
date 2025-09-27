/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Alima
 */
public class Factura {

    private String fecha;
    private int numeroFactura;
    private Cliente cliente;
    private String mesPaga;
    private double valorPagado;
    private Servicio servicio;
    private String formaDePago;
    private Empleado cajero;

    public Factura() {
    }

    public Factura(String fecha, int numeroFactura, Cliente cliente, String mesPaga, double valorPagado, String formaDePago, Empleado cajero) {
        this.fecha = fecha;
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.mesPaga = mesPaga;
        this.valorPagado = valorPagado;
        this.servicio = servicio;
        this.formaDePago = formaDePago;
        this.cajero = cajero;
    }

    public Factura(int numeroFactura, Cliente cliente, String fecha, double valorPagado, String mesPaga, Empleado cajero) {
        this.fecha = fecha;
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.mesPaga = mesPaga;
        this.valorPagado = valorPagado;
        this.formaDePago = formaDePago;
        this.cajero = cajero;
    }

    public Empleado getCajero() {
        return cajero;
    }

    public void setCajero(Empleado cajero) {
        this.cajero = cajero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getMesPaga() {
        return mesPaga;
    }

    public void setMesPaga(String mesPaga) {
        this.mesPaga = mesPaga;
    }

    public double getValorpagado() {
        return valorPagado;
    }

    public void setValorpagado(double valorpagado) {
        this.valorPagado = valorPagado;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura{");
        sb.append("fecha=").append(fecha);
        sb.append(", numeroFactura=").append(numeroFactura);
        sb.append(", cliente=").append(cliente);
        sb.append(", mesPaga=").append(mesPaga);
        sb.append(", valorpagado=").append(valorPagado);
        sb.append(", servicio=").append(servicio);
        sb.append(", formaDePago=").append(formaDePago);
        sb.append(", cajero=").append(cajero);
        sb.append('}');
        return sb.toString();
    }

}
