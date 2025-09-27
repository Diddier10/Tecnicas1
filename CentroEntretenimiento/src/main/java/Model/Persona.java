/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Alima
 */
public class Persona {

    private String identificación;
    private String apellidos;
    private String nombres;
    private String sexo;
    private int edad;
    private double peso;
    private String dirección;
    private int telefono;

    public Persona() {
    }

    public Persona(String identificación, String apellidos, String nombres, String sexo, int edad, double peso, String dirección, int telefono) {
        this.identificación = identificación;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.dirección = dirección;
        this.telefono = telefono;
    }

    public Persona(String identificación, String apellidos, String nombres, String sexo, int edad, double peso) {
        this.identificación = identificación;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public Persona(String identificación) {
        this.identificación = identificación;
    }

    public Persona(String apellidos, String nombres) {
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public String getIdentificación() {
        return identificación;
    }

    public void setIdentificación(String identificación) {
        this.identificación = identificación;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("identificacion=").append(identificación);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", nombres=").append(nombres);
        sb.append(", sexo=").append(sexo);
        sb.append(", edad=").append(edad);
        sb.append(", peso=").append(peso);
        sb.append(", direccion=").append(dirección);
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }
}
