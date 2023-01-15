/*
2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla. 
*/
 


import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ejericioN2ulp {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        System.out.println("Digitar el nombre: ");
        nombre = entrada.next();
        
        System.out.println("Mi nombre es : "+nombre);
        
        
        
    }
}
