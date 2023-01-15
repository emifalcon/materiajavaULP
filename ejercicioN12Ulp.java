
import java.util.Scanner;

/*

12. Escriba un programa que valide si una nota está entre 0 y 10,sino está entre 0 y 10

la nota se pedirá de nuevo hasta que la nota sea correcta.

*/
 

/**
 *
 * @author usuario
 */
public class ejercicioN12Ulp {
    public static void main(String[] args) {
        Scanner entrada = new  Scanner (System.in);
        int nota;
       
         System.out.println("Digite la Nota: ");
        nota = entrada.nextInt();
        
        
           do {            
             System.out.println("Se solicita de nuevo la nota");
                nota = entrada.nextInt();
        } while (nota < 0 || nota > 10);
           
               
        
  


if (nota >=0 && nota <=10) {
                System.out.println("La Nota es Correcta "+nota); 
              
            }        
            
       
        
        
        
    }
}
