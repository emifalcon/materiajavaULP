/*
 
 */
package ejercicion1rclase;

/**
 *
 * @author usuario
 */
public class Jugador {
    
    static private  int id;
    
    private int idJugador;
    
    private String nombre;
    
    private boolean mojado;
    static {
        id=0;
    }
    
    public Jugador( String nombre){

id = ++id;

idJugador=id;
this.nombre = nombre+id;
this.mojado = false;

}
    
    
    public boolean disparo(RevolverAgua ra){
        
        if (ra.mojar()) {
            mojado = true;
            
            return  true;
        }
        ra.siguienteChorro();
        return  false;
    }

    @Override
    public String toString() {
        return "Jugador{" + "idJugador=" + idJugador + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
}

