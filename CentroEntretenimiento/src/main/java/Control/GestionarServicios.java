/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Cliente;
import Model.PlanEntrenamiento;
import Model.Servicio;
import Util.Lectura;
import java.util.ArrayList;

/**
 *
 * @author Ali
 */
public class GestionarServicios {

    ArrayList<Cliente> listaClientes;
    ArrayList<PlanEntrenamiento> listaPlanes;
    private Lectura lectura = new Lectura();

    public GestionarServicios(ArrayList<Cliente> listaClientes, ArrayList<PlanEntrenamiento> listaPlanes) {
        this.listaClientes = listaClientes;
        this.listaPlanes = listaPlanes;
    }


    public void mostrarPlanesDeEntrenamiento() {
        if (listaClientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente c = listaClientes.get(i);
            System.out.println("Cliente: " + c.getNombres() + " " + c.getApellidos());
            System.out.println("===== PLAN DE ENTRENAMIENTO =====");
            System.out.println("""
                           ESTE PLAN SE REPETIRA SOLAMENTE POR 4 SEMANAS
                           Dia 1: Cardio intenso (30 minutos)
                           Dia 2: Piernas y gluteos (sentadillas, lunges, peso muerto)
                           Dia 3: Pecho y triceps (flexiones, fondos, press con mancuernas)
                           Dia 4: Espalda y biceps (dominadas, remo con mancuerna)
                           Dia 5: Core (abdominales, plancha, mountain climbers)
                           Dia 6: Cardio + fuerza (circuito de saltos, burpees, sentadillas)
                           Dia 7: Estiramientos y recuperacion activa (yoga, caminata suave)""");
        }
        System.out.println("-----------------------------------------------------------------");
    }
}
