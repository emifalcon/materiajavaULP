/*
3. Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número
entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta
clase debe contener un método toString() que retorne el número de carta y el palo. La
baraja estará compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya
más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número
de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta
y luego se llama al método, este no mostrara esa primera carta.




 */
package ejercicion3rclases;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicion3Rclases {

  
    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
     int opcion = 0;
     int darcantidad;
Baraja B = new Baraja();
     
//     Carta[] c = B.darCartas(4);
//     
//      for(int i=0;i<c.length;i++){
//            System.out.println(c[i]);
//    }   
//     c = B.darCartas(39);
     
   //  B.mostrarB();
        System.out.println("Seleccione las siguientes operaciones para la baraja : "+
        "1. cartas Disponibles. "+
        "2. Siguiente carta. "+
        "3. Dar cartas. "+
        "4. Barajar el mazo. "+
        "5. Mostrar todas las cartas. "
       +"6. Mostrar las cartas salidas. ");
        
        
        
        do{
        opcion = entrada.nextInt();
        
 
        switch (opcion) {
            case 1:
                  System.out.println("Hay "+B.cartasDisponibles()+" castas disponibles. ");
                break;
                
            case 2:
                
                 B.siguienteCarta();
                break;
            case 3:
                 //Sacar cartas
                System.out.println("Ingrese la cantidad de cartas que quiere dar: ");
                
            darcantidad = entrada.nextInt();
            
       B.darCartas(darcantidad);
       
        //Mostramos las cartas disponibles:
      System.out.println("Hay "+B.cartasDisponibles()+" cartas disponibles");
//       
       System.out.println("Cartas sacadas de momento");
       
            case 4: 
                
                 B.barajar();
                 
            case 5:
                
                B.mostrarB();
                break;
                
            case 6: 
                B.Mazo();
                break;
            default:
                System.out.println("Opcion Incorrecta, vuelva seleccionar la operacion. ");
        }
        }while (opcion>0 && opcion<7);           
            
        
    

     //Saco una carta
    
////        B.siguienteCarta();
////        B.siguienteCarta();
////        B.siguienteCarta();
////        B.siguienteCarta();
//        
//        
 // System.out.println(B.cartasDisponibles());
//        
//        B.Mazo();
        
//        //Sacar cartas
//       B.darCartas(4);
////        
////        //Mostramos las cartas disponibles:
//      System.out.println("Hay "+B.cartasDisponibles()+" cartas disponibles");
////       
//       System.out.println("Cartas sacadas de momento");
////        
//      B.Mazo();
////        
////        
////        //Barajamos de nuevo
//       B.barajar();
////       
//       B.mostrarB();
//
////        //Sacar cartas
//      Carta[] c = B.darCartas(5);
////        
//       System.out.println("Cartas sacadas despues de barajar ");
//       for(int i=0;i<c.length;i++){
//           System.out.println(c[i]);
//   }   
        
        
        
        
}
}