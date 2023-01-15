/*
6. Implementar un programa que dado dos números enteros determine cuál es el mayor 
y lo muestre por pantalla. 

*/
 


import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Condicionalesn6Ulp {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num ,num2;
        
        System.out.println("El numero1: ");
        num = leer.nextInt();
        
        System.out.println("El numero2: ");
        num2 = leer.nextInt();
        
         if(num > num2) {
       
            System.out.println("Se imprimira el valor numero1 "+num);
            
        }
         else if (num2>num) {
            
            System.out.println("Se imprimira el valor N2 "+num2);
            
        }else {
            
            System.out.println("Ambos numeros enteros son Iguales == ");
            
        }
        
    }
}
/*else {
            
            System.out.println("Ambos numeros enteros son Iguales == ");
            
        }*/