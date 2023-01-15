/*
3. Escribir un programa que pida una frase y 
la muestre toda en mayúsculas y 
después toda en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/
 


import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ejercicion3Ulp {
    public static void main(String[] args) {
       Scanner entrada = new  Scanner(System.in);
        String frase; 
        System.out.print("Digite la frase: ");
        frase = entrada.next();
        
        System.out.println("la frase de forma de MAYUSCULA "+frase.toUpperCase());
        
        System.out.println("La frase de forma minuscula "+frase.toLowerCase());
        
         /* String entrada = new String("MAYÚSCULA CONVERTIDA EN MINÚSCULA");       
        // Convertir a LowerCase     
        System.out.println(entrada.toLowerCase());  
        */
        
        
    }
}
