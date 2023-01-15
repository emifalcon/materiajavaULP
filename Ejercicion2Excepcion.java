/*
 Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo
fuera de rango).
 */
package ejercicion2excepcion;

/**
 *
 * @author usuario
 */
public class Ejercicion2Excepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dia = 3;
        
        switch (dia) {
            case 1:
                System.out.println("l");
            case 2:
                System.out.println("m");
            case 3:
                System.out.println("mm");
            case 4:
                System.out.println("j");
            case 5: 
                System.out.println("vv");
            default:
                System.out.println("ottto");
                
        }
            
            
            
        }
        
        
    }
    
}
