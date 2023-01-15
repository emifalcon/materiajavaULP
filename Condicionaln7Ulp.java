/*
7. Crear un programa que dado un numero determine si es par o impar. 

*/
 


import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Condicionaln7Ulp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite el numero: ");
        numero = entrada.nextInt();
        
        if (numero %2 == 0) {
            System.out.println("mi numero es Par: "+numero);
        }else{
            
            System.out.println("El N es Impar. ");
            
        }
        
        
        
        
        
        
    }
}
