
import java.util.Scanner;

/*

23. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz.

*/
 

/**
 *
 * @author usuario
 */
public class EjercicioN23ulp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("El limite de los valores Aleatorios: ");
        //int limiteA = entrada.nextInt();
        int [][] matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("el llenado de la Matriz: filas: ["+i+"] ["+j+"] :Columnas ");
                matriz[i][j]= (int)(Math.random()*10) ;
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                System.out.print(" "+matriz[i][j]+"");
            }
            System.out.println("");
        }
        
        
        System.out.println("/////// Transpuesta de la Matriz");
        
        
       for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {  
                
                System.out.print(" "+matriz[j][i]+" ");
            }
            System.out.println(" ");
        }
        
        
    }
}
