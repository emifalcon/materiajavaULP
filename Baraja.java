/*

 */
package ejercicion3rclases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author usuario
 */
public class Baraja {
    
    private Carta cartas[];
    
    private int posteriorCarta;
    
    public static final int NUM_Cartas=40;
    
    
    

    public Baraja() {
        
        this.cartas = new Carta[NUM_Cartas];
        this.posteriorCarta=0;
        crearBaraja();
        
        barajar();
    }
    
    private  void crearBaraja(){
        
        String[] palos= Carta.PALOS;
        
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < Carta.Limite_Palo; j++) {
                
                if (!(j==7 || j==8)) {
                    
                    
                    if (j>=9) {
                        
                          cartas[((i* (Carta.Limite_Palo-2))+(j-2)) ]= new Carta(j+1, palos[i]);
                        
                    }else{
                        
                        cartas[((i* (Carta.Limite_Palo-2))+ j) ]= new Carta(j+1, palos[i]);
                        
                    }
                    
                    
                }
                
            }
        }
    }
    
    public void barajar(){
        
        int aleatoria=0;
        
        Carta c;
        
        for (int i = 0; i < cartas.length  ; i++) {
            
            aleatoria= Metodos.generarNumeroAleatorio(0,NUM_Cartas-1);
            
            c= cartas[i];
            
            cartas[i]= cartas[aleatoria];
           cartas[aleatoria]=c;
           
           
        }
        
        this.posteriorCarta=0;
    }
    
  public  Carta siguienteCarta(){
      
      
      Carta c = null;
      if (posteriorCarta==NUM_Cartas) {
          System.out.println("No queda mas Cartas. ");
      }else{
          
          c = cartas[posteriorCarta++];
      }
      
      return  c;
  }
   
    
    public  Carta[] darCartas( int nCartas){
        
        if (nCartas>=NUM_Cartas) {
            
            System.out.println("No puede dar mas cartas de la que hay. ");
            
            return  null;
        }else {
            if (cartasDisponibles()< nCartas) {
                System.out.println("No hay suficiente cartas para Mostrar. ");
            }else{
                
                Carta [] dCartas = new Carta[nCartas] ;
                
                for (int i = 0;i< dCartas.length ; i++) {
                    
                    dCartas[i]= siguienteCarta();
                    
                }
                return dCartas;
                
            }
          return  null;   
        }
        
       
        
    }
    
    
    
     public int cartasDisponibles(){
        
         
         return NUM_Cartas-posteriorCarta;
         
    }
     
     
     
     
    public void Mazo(){
        if (cartasDisponibles() == NUM_Cartas) {
            
            System.out.println("No se saco ninguna carta. ");
            
        }else {
        for (int i = 0; i < posteriorCarta; i++) {
            
            System.out.println(cartas[i]);
            
        }    
            
        }
        
        
        
    }
    
    public void mostrarB(){
        if (cartasDisponibles() ==0) {
            System.out.println("No hay carta que Mostar. ");
        }else {
            
             for (int i = posteriorCarta; i < cartas.length ; i++) {
            
            System.out.println(cartas[i]);
            
        }    
        }
        
        
        
        
    }
    
    
    
    
    
    
    
}
