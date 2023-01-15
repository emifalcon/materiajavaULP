
import java.util.Scanner;

/*
22. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

*/
 

/**
 *
 * @author usuario
 */
public class EjercicioN22Ulp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el llenado del vector con N Enteros: ");
        int N = entrada.nextInt();
        int[] vector = new int[N];
        
        int Duno=0;
        int Ddos=0;
        int Dtres = 0; 
        int Dcuatro = 0;
        int Dcinco = 0; 
                
        for (int i = 0; i < N; i++) {
            vector[i] = (int)(Math.random()*N) ;
            
            if (vector[i]<10) {
                Duno++;
            }
            else if (vector[i]>9 && vector[i]<100) {
                Ddos++;
            }else if (vector[i]>99 && vector[i]<1000) {
                Dtres++;
            }else if (vector[i]>999 && vector[i]<10000) {
                Dcuatro++;
            }else if (vector[i]>9999 && vector[i]<100000) {
                Dcinco++;
            } else {
                System.out.println("El rango del numero es mayor a los 5 Digitos. ");
            }
        }
        
        System.out.println("cantidad de 1 digito: "+Duno);
        System.out.println("cantidad de 2 digitos: "+Ddos);
        System.out.println("cantidad de 3 digitos: "+Dtres);
        System.out.println("cantidad de 4 digitos: "+Dcuatro);
        System.out.println("cantidad de 5 digitos: "+Dcinco);
                
    }
}
