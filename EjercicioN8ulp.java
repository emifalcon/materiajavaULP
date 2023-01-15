/*

8. Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.


Nota: investigar la función equals() en Java. 

*/
 


import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioN8ulp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Digite la frase: ");
        frase = entrada.next();
        
        
        
        if (frase.equals("eureka") ) { //equales : igualar exactamente la palabra y equalsIgnoreCase : para igualar sin se exacto la frase.
            
            System.out.println("La frase es Correcta. ");
            
        }else {
            
            System.out.println("La frase es Incorrecto. ");
        }
        
        
    }
}
