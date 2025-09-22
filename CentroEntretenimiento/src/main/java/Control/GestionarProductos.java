/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Persona;
import Model.Producto;
import Util.Lectura;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Ingresar un producto
 * Buscar un producto
 * @author Ali Garshasebi
 */
public class GestionarProductos {
    ArrayList<Producto> listaProductos;
    private Lectura lectura = new Lectura();
    Producto producto = new Producto();
    public Producto crearProducto(){
        System.out.println("A continuación ingrese los datos del producto.");
        producto.setCodigo(lectura.leerInt("Igrese el código: "));
        producto.setDescripcion(lectura.leerString("Ingrese el nombre: "));
        producto.setDescripcion(lectura.leerString("Ingrese la descripción: "));
        listaProductos.add(producto); //Validar inserción , boolean 
        return producto;  
    }
    
    public void buscarProducto() {
        Producto producto = new Producto();
        String codigo;
        int indice;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el codigo del producto a buscar: ");
        codigo = entrada.next();
        Producto producto = new Producto(codigo);
        indice = listaProductos.indexOf(producto);
        System.out.println("Estoy buscando una persona con dni=1"+indice);
        if (indice != -1) { //Lógica negativa.
            producto = listaProductos.get(indice);
            System.out.println(producto);
        } else {
            System.out.println("El producto no se encuentra");
        }
    }

    public void eliminarProducto() {
        String dni;
        int indice;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese DNI para eliminar: ");
        dni = entrada.next();
        Persona persona = new Persona(dni);
        indice = listaProductos.indexOf(persona);
        if (indice != -1) {
            producto = listaProductos.remove(indice);
            System.out.println("Persona eliminada: " + persona);
        } else {
            System.out.println("La persona no se encuentra");
        }
    }
    
    public void mostrarProductos() {
        if (listaProductos.size() > 0) {
            for (Producto producto: listaProductos) {
                System.out.println(producto);
            }
        } else {
            System.out.println("No existen productos registrados");
        }
    }
    
     public void ordenarPorNombre() {
        Collections.sort(listaProductos, (Producto producto1, Producto producto2)
                -> producto1.getNombre().compareTo(producto2.getNombre()));
        mostrarProductos();
    }
     /*public Producto consultarProducto(id){
     
       }
     public Producto consultarProducto(nombre){
     
       }
     */
}
