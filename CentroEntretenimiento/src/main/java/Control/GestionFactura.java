/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author Alima
 */
public class GestionFactura implements Pago {
    
    public void crearFactura(){
       /*Verificar que tenga deuda antes del servicio if deuda>0
        verificar el mes que va a pagar; con la fecha o con la duracion 
       Calcular el valor a pagar valor deuda+valorservicio
       asienta el registro */
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
