/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList


 */
package ejercicion1coleccion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicion1Coleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
   String opcion;
        ArrayList<String> razasperros = new ArrayList();
        
        
      do{
          
          System.out.println("Ingrese una raza de perro: ");
          String perros = entrada.nextLine();
          razasperros.add(perros);
          
          System.out.println("Quiere agregar otra raza de perro? opciones: Si o No ");
          opcion = entrada.nextLine();
          
          
          
      }while (opcion.equalsIgnoreCase("s")); 
        
        for (String RazasPerros : razasperros) {
            
            System.out.println(RazasPerros);
              
        }
        
    }
    
}
