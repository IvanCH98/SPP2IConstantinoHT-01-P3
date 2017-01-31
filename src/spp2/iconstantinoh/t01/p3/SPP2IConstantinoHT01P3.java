/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Iván Constantino Hernández
//A01411529 IIS
package spp2.iconstantinoh.t01.p3;
import java.util.Scanner;

/**
 *
 * @author ivana
 */
public class SPP2IConstantinoHT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
       //Declaración de variables
        System.out.println("Calcular la distancia entre dos puntos");
        double x1, y1, x2, y2, dis;
        System.out.println("Introduzca el valor de x1");
        x1=kb.nextDouble();
       System.out.println("Introduzca el valor de y1");
        y1=kb.nextDouble();
        System.out.println("Introduzca el valor de x2");
        x2=kb.nextDouble();
        System.out.println("Introduzca el valor de y2");
        y2=kb.nextDouble();

        dis= Math.sqrt(Math.pow(x1-x2,2)+ (Math.pow(y1-y2,2)));
        
        System.out.println("La distancia es: "+dis);
        
        
    }       
}
