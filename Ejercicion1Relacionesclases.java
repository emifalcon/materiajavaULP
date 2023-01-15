/*
 
 */
package ejercicion1relacionesclases;

import ejercicion1relacionesclases.Perro;
import ejercicion1relacionesclases.Persona;
/**
 *
 * @author usuario
 */
public class Ejercicion1Relacionesclases {

    
    
    
    
    public static void main(String[] args) {
 
        
        Perro mascota = new Perro("arka", "Pastor Aleman", 7, "mediano");
        
        
       Perro mascota1 = new Perro("krifo", "Pitbull",11 , "grande-mediano");
       
       
       Persona gente1 = new Persona();
        
       Persona gente2 = new Persona();
        
        gente1.setPerro(mascota);
        
        gente2.setPerro(mascota1);
        //agregar persona numero1:
        gente1.mostrarPersonaConElPerro();
        System.out.println(" ");
        System.out.println("-----------------------------");
        System.out.println(" ");//agregar persona numero2:
        gente2.mostrarPersonaConElPerro();
    }
    
}
