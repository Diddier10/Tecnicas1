/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Alima
 */
public class Empleado extends Persona {
    private int salario;
    private int antiguedad;
    private String cargo;

    public Empleado() {
    }

    public Empleado(int salario, int antiguedad, String cargo) {
        this.salario = salario;
        this.antiguedad = antiguedad;
        this.cargo = cargo;
    }

    public Empleado(int salario, int antiguedad, String cargo, String identificación, String apellidos, String nombres, String sexo, int edad, double peso, String dirección, int telefono) {
        super(identificación, apellidos, nombres, sexo, edad, peso, dirección, telefono);
        this.salario = salario;
        this.antiguedad = antiguedad;
        this.cargo = cargo;
    }

    public Empleado(int salario, int antiguedad, String cargo, String identificación, String apellidos, String nombres, String sexo, int edad, double peso) {
        super(identificación, apellidos, nombres, sexo, edad, peso);
        this.salario = salario;
        this.antiguedad = antiguedad;
        this.cargo = cargo;
    }

    public Empleado(int salario, int antiguedad, String cargo, String identificación) {
        super(identificación);
        this.salario = salario;
        this.antiguedad = antiguedad;
        this.cargo = cargo;
    }

    public Empleado(int salario, int antiguedad, String cargo, String apellidos, String nombres) {
        super(apellidos, nombres);
        this.salario = salario;
        this.antiguedad = antiguedad;
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("salario=").append(salario);
        sb.append(", antiguedad=").append(antiguedad);
        sb.append(", cargo=").append(cargo);
        sb.append('}');
        return sb.toString();
    }

    
    
   
    
    

    
    
    
}
