/*
 
 */
package ejercicion1rclase;

/**
 *
 * @author usuario
 */
public class RevolverAgua {
    
    private  int posicionActual;
    private int posicionAgua;

    public RevolverAgua() {
    }

    public RevolverAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    public void llenarResolver(){
        
        posicionActual = (int) (Math.random()*6)+1;
        
        posicionAgua = (int) (Math.random() *6)+1;
        
    }
    
    public  boolean mojar(){
        
        if (posicionAgua == posicionActual) {
            System.out.println("La  posicion Actual que dispadara: "+posicionActual);
        }
        return posicionActual == posicionAgua;
    }
    
    public void  siguienteChorro(){
        posicionActual++;
        System.out.println("La posicion del agua coincide con la posicion Actual: "+posicionActual);
        posicionActual%=7;
        if (posicionActual==0) {
            posicionActual++;
        }
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
    
}
