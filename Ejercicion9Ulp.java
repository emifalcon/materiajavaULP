/*

9. Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo 
se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”. 



Nota: investigar la función Lenght() en Java.

*/



import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicion9Ulp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        String frase;
        
        System.out.println("Digite la frase: ");
        frase = entrada.next();
        int longitud = frase.length();
        
        
        
        
        if (longitud == 8 ) {
            System.out.println("El mensaje es Correcto");
        }else {
            System.out.println("El mensaje es Incorrecto");
            
        }
        
        
        
    }
    
}
