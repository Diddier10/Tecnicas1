/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*/

package com.mycompany.mavenproject1;



/*  
Se requiere una calculadora que trabaje con todos los tipos de datos: int, short, byte, long, double, Double, Float, float

se requiere que haga las operaciones basicas, sumas,resta, multiplicacion, division

promocion y casting
*/

/**
 *@version 1.0.0
 * @author samuel.lopezs
 */
public class Calculadora {
    static Double nD= 20.0;
    static double nd=10 ;
    static Float nF=50.0f;
    static float nf= 3;
    static int ni=5;
    static Integer nI=10;

    public static double sumar(){
        //promocion
        nd = nf;
        //casting
        ni = nf;
        ni = (int)nf;
        ni = (int)nd;
        //casting con conversion de tipo
        ni = (int)nF.
    }
        
        return(nd + nD);
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
}
