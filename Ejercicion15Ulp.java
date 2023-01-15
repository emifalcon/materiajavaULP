
import java.util.Scanner;

/*

15. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero".

El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. 



Nota: recordar el uso de la sentencia break.

*/
 

/**
 *
 * @author usuario
 */
public class Ejercicion15Ulp {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        int num ,suma=0,contador=0 ;
        
       
        
         //  do {            
            
       
         for (int i=0;i<20;i++) {   
            System.out.print(i+" Digite un numero: ");
        num = entrada.nextInt();
            
            if (num>0) {
                 contador+=num;
                suma=+contador;
                
               
            }
           if(num<0){
                    System.out.println("No se suma. ");
                
            }
            if (num == 0) {
                 break;
            }
             
        
          // }while (num<0);
        
          
  
    }
         System.out.println("Se capturó el numero cero");
        System.out.println("La suma de los numeros digitados: "+suma);
    }     
}
