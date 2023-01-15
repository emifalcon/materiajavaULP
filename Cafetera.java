
package ejercicion6poo;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Cafetera {
  
  private int capacidadMaxima=50;
private int   cantidadActual;

    public Cafetera() {
        
    }
    
    
    

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
    
    public int llenarCafetera(){
        
       return cantidadActual=capacidadMaxima;
        
        
    }

    @Override
    public String toString() {
        return "Cafetera: " + "capacidadMaxima= " + capacidadMaxima + ", cantidadActual= " + cantidadActual;
    }
    
    
    public int servirTaza(){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("El tamanio de la taza: ");
        int tazavacia = entrada.nextInt();
        
     
        
        if (tazavacia>cantidadActual) {
            System.out.print("Se sirve lo que quede. Cuanto quedo en la taza? ");
            return tazavacia=cantidadActual ;
        }else{
            System.out.println(" Se lleno la taza.Lo que sobro en la cafetera es :");
            return tazavacia=cantidadActual;
        }
    }
        public int vaciarCafetera(){
            
            return  cantidadActual=0;
              
        
    }
    
    public int agregarCafe(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de cafe que quiere agregar en la cafetera: ");
        int cantidadcafe = entrada.nextInt();
      return cantidadActual=cantidadcafe;
        
        
    }
}
