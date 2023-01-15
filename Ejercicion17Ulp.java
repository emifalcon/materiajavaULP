


/*
17. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/
 

/**
 *
 * @author usuario
 */
public class Ejercicion17Ulp {
    public static void main(String[] args) {
       
      /* Scanner entrada = new  Scanner(System.in);
        System.out.println("Digite el caracter: ");
      
         String caracter = entrada.next();*/
        for (int elem = 0;elem <=2;elem++) {
           
        
        System.out.print(" *");  
        }
        for (int i = 0; i <= 2;i++) {
           
         System.out.println(" *     *");
         //System.out.println("         *");
        } 
        for (int elem = 0;elem <=3;elem++) {
           
        
        System.out.print(" *");  
        }
    }
 
}
