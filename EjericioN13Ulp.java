
import java.util.Scanner;

/*
13. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.




*/
 

/**
 *
 * @author usuario
 */
public class EjericioN13Ulp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numeroP,solicitar,sum = 0;
        
        System.out.println("Digite el valor Limite Positivo: ");
        numeroP = entrada.nextInt();
          
        do {            
            System.out.println("Solicitar numero: ");
           solicitar = entrada.nextInt();
            if (solicitar>0) {
                sum=sum+solicitar;
            }
         
        } while (sum< numeroP);
            
            System.out.println("Supero el Limite Inical: "+numeroP);
        
           
            
        
        
        
        
        
        
        
        
        
    }
}
