

import java.util.Random;
import java.util.Scanner;

/*
Funciones en Java
20. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
*/
 

/**
 *
 * @author usuario
 */
public class Ejercicion20 {
    public static void main(String[] args) {
       Scanner entrada = new  Scanner(System.in);
     
        int [] vector = new int[100];
       
         System.out.println("El llanado de los numeros Enteros: ");
        for (int i= 0;i<100;i++) {
          
            vector[i] = i+1;
            System.out.println("El llenado de la posicion "+(i+1)+" es: "+vector[i]);
            
        }
        
        System.out.println("              ");
        System.out.println("Los numeros en orden descendente: ");
        for (int i = 99; i > -1; i--) {
            System.out.print(vector[i]+"\n ");
        }
        /* System.out.println("Orden Descedente: ");
        for (int i = 99; i > 0; i--) {
           
            System.out.print(vector[i]+"\n ");
        }*/
        
    }

    
}
