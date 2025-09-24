/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alima
 */
public class GestionFactura implements Pago {
    ArrayList<Cliente> listaClientes;

    public GestionFactura(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    public void crearFactura(){
       /*Verificar que tenga deuda antes del servicio if deuda>0
        verificar el mes que va a pagar; con la fecha o con la duracion 
       Calcular el valor a pagar valor deuda+valorservicio
       asienta el registro */
    }
 
    public void estadoDeuda() {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese identificacion para buscar: ");
    String identificacion = entrada.nextLine();
    Cliente clienteEncontrado = null;
    for (Cliente c : listaClientes) {
        if (c.getIdentificación().equals(identificacion)) {
            clienteEncontrado = c;
            break;
        }
    }
    if (clienteEncontrado == null) {
        System.out.println("Cliente con identificacion " + identificacion + " no fue encontrado.");
    } else {
        System.out.print("Ingrese el mes a consultar: ");
        String mes = entrada.nextLine();
        System.out.println("\nEstado de cuenta de: "+ clienteEncontrado.getNombres() + " "+ clienteEncontrado.getApellidos());
        if (clienteEncontrado.getMesActual().equalsIgnoreCase(mes)) {
            if (clienteEncontrado.getDeuda() > 0) {
                System.out.println("Mes: " + mes);
                System.out.println("Deuda actual: $" + clienteEncontrado.getDeuda());
                System.out.println("No tiene derecho al gimnasio hasta pagar la deuda.");
            } else {
                System.out.println("Mes: " + mes);
                System.out.println("Estas al dia con los pagos.");
                System.out.println("Tiene derecho al gimnasio.");
            }
        } else {
            System.out.println("En el mes " + mes + " no tiene deuda registrada.");
        }
    }
}
    
    /*public Factura buscarFactura(int numero){
        
    }
    
    public Factura buscarFactura(Cliente cliente){
        
    }
    
    public Factura mostrar(){
        
    }
    public ArqueoDecaja(int id, String fecha){
        
    }*/
    //PARA ESTE EJERCICIO NO SE ELIMINARÁ LA FACTURAAAA
    
    @Override
    public void pagoEfectivo(){
        System.out.println("Ingrese el valor a pagar: ");
     
    }
    @Override
    public void pagoCheque(){
        System.out.println("Banco del cheque:");
        System.out.println("Numero: ");
    }    
}
