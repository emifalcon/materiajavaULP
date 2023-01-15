/*

 */
package ejercicion3rclases;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Carta {
    
      private int num;
      private String palo;
      
      
    public static  final String [] PALOS={"Espadas","Oros","Copas","Bastos"};
      
      
public static final int Limite_Palo=12;


    public Carta() {
    }

      
      
      
      
    public Carta(int num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta: " + "num=" + num + ", palo: " + palo ;
    }
      
      
      
      
      
      
      
      
}
