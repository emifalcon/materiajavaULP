
import java.util.Scanner;

/*
19. Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).


El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/


/**
 *
 * @author usuario
 */
public class EjercicioN19Ulp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     double Cyenes = yenes(129.852);
      double CDolar = dolar(1.28611);
       double Librass = libras(0.86);
       
        System.out.println("La cantidad de euro: ");
        int euro = entrada.nextInt();
        System.out.println("El tipo de cambio de moneda: ");
        int teclado = entrada.nextInt();
        switch (teclado) {
            case 1:
     
        System.out.print(Cyenes * euro); 
           Yeneee(" yenes ");    
        break;
            case 2:
                
        System.out.print(CDolar * euro);
                Dolaar(" dolares ");
        break;
            case 3:
               
        System.out.print(Librass * euro);
         Libraa(" libras ");
      
        
        }
      /*  switch (teclado) {
            case 1:
                System.out.println(); 
                break;
            case 2:
                System.out.println("");
            case 3:
                System.out.println("");
            break;
           
                
        }*/
        
        
        
        
        
        
        
    }
       
       
    public static  double yenes(double yenes){
        
       
        
       double y = ( yenes);   
        
        return y;
       
    }
     public  static double dolar (double dolar){
         
         
         double d = (dolar);
         return  d;
     }
       
    public  static double libras (double libras){
         
         
         double L = (libras);
         return  L;
     }   
       
       
     public static  void Libraa(String LibrA){
         
         System.out.println(LibrA);
      
         
     }
        public static  void Dolaar(String DolaR){
         
         
         System.out.println(DolaR);
         
         
     }
      public static  void Yeneee(String Yeness){
         
        
         System.out.println(Yeness);
         
     }  
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       /* double libras = 0.86, $= 1.28611, yenes = 129.852  ;  
     
        System.out.println("Digite la cantidad de euro a convertir: ");
     int euro= entrada.nextInt();
        System.out.println("A que moneda quiera convertir?..");
     int Conversion = entrada.nextInt();
        switch (Conversion) {
            case 1:
                System.out.println("La conversion a libras es: "+libras * euro );
                break;
                case 2:
                    System.out.println("La conversion a dolar es: "+$ * euro);   
                 break;
                case 3:
                    System.out.println("La conversion a yenes es: "+yenes * euro);
                    break;
            default:System.out.println("No existe ese tipo de conversion. ");

        }*/
    
}    
