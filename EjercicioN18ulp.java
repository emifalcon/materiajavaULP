
import java.util.Scanner;

/*
18. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor.

Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
 

/**
 *
 * @author usuario
 */
public class EjercicioN18ulp {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        int num,cantidad = 0;
        String  caracter = "*";
        
        //System.out.print("Digite el numero: ");
        while (cantidad<4) {            
            cantidad++;
         System.out.print("Digite un numero entre 1 y 20: ");

            num = entrada.nextInt();
          
            if (num>=1 && num<=20) {
                
            System.out.print(num+" ");
            for (int j = 0; j < num; j++) {
          
                System.out.print(caracter);
        //if (num>=1 || num<=20) 
          //caracter+=caracter;
            }
                System.out.println(" ");
        }else {
                System.out.println("Se solicita De nuevo un numero.");
                
            }
        }    
        
    }
}
