/*
1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma .
*/
 


import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ejercicion1ulp {
    public static void main(String[] args) {
       Scanner entreda = new  Scanner (System.in);
        int num, num2;
        int suma= 0;
        
        System.out.println("DIGITE el numero 1: ");
        num = entreda.nextInt();
        System.out.println("Digite el numero 2: ");
        num2 = entreda.nextInt();
        
        suma = num + num2;
        
        System.out.println("La suma Total de los numeros es: "+suma);
    }
}
