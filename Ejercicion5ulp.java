/*
5. Escribir un programa que lea un número entero por teclado 
y muestre por pantalla el doble, el triple 
y la raíz cuadrada de ese número.


Nota: investigar la función Math.sqrt()

*/
 


import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicion5ulp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  int num, doble= 0, triple= 0;
        
        System.out.println("Digite un numero: ");
        num = entrada.nextInt();
        
        
        doble = 2*num;
        System.out.println("El doble del numero: "+doble);
        //////////
     
        triple = 3*num;
           System.out.println("El triple es: "+triple);
        //////////
        
        System.out.println("La raiz Cuadrada del Numero es: "+Math.sqrt(num));
        
    }
}
