/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Ali
 */
public class Servicio {

    private String nombres;
    private int codigo;
    private String duracion;
    private String descripción;
    private String precio;
    private int id;

    public Servicio() {
    }

    public Servicio(String nombres, int codigo, String duracion, String descripción, String precio, int id) {
        this.nombres = nombres;
        this.codigo = codigo;
        this.duracion = duracion;
        this.descripción = descripción;
        this.precio = precio;
        this.id = id;
    }

    public Servicio(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Servicio{");
        sb.append("nombres=").append(nombres);
        sb.append(", codigo=").append(codigo);
        sb.append(", duracion=").append(duracion);
        sb.append(", descripcion=").append(descripción);
        sb.append(", precio=").append(precio);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }

}
