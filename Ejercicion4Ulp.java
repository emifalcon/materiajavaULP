/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5). 

*/



import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicion4Ulp {
    public static void main(String[] args) {
        
        float gradoF = 0;
        float gradoCf;//f al final de la variable para remarcar que es float.
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Digite los grados Centigrado: ");//cortrol +r : cambiar los nombre de manera silmuntaneas o al mismo tiempo.
        
        gradoCf = entrada.nextFloat();
        
        gradoF = 32 + (9 * gradoCf / 5);
        
        System.out.println("El equivalente en grado Fahrenheit: "+gradoF);
    }
}
