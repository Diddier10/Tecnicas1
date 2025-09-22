/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDAO;

import Datos.Persona;  // no herencia
import Excepcione.PersonaNotFoundException;

public class PersonaDAO {

    public static Persona buscarPersona(Persona[] personas, String id) throws PersonaNotFoundException {
        int i = 0;
        Persona laEncontre = null;
        while (i < personas.length) { //Mejorar este ciclo, esta muy feo
            if (personas[i] != null) {
                // 71211368
                // 7121
                if (personas[i].getIdentificacion().equals(id)) {
                    laEncontre = personas[i];

                }
            }
            i++;
        }

        if (laEncontre == null) {
            //throw new PersonaNotFoundException("no la encontre");
            throw new PersonaNotFoundException();
        }

        return laEncontre;

    }

}
