/*

 */
package ejercicion1rclase;

import java.util.List;
import  java.util.ArrayList;
/**
 *
 * @author usuario
 */
public class Juego {
    
    List<Jugador>players;
    RevolverAgua ra;
    
    final int Max_Jugadores=6;
    
    
    public void llenarJuego(ArrayList<Jugador>jugadores,RevolverAgua ra){
        
        this.players=jugadores;
        
        this.ra= ra;
    }
    
    public Jugador laRonda(){
        
        int i=-1;
        int j=1;
        
        do {  
            
            i++;
            
            if (i==3) j++;
                
            System.out.println("ronda; "+j);
            i%= players.size();
            System.out.println("jugador: "+ players.get(i));
            
        } while (!players.get(i).disparo(ra));
        
        return players.get(i);
        
    }
    
}
