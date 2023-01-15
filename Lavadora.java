/*

 */
package ejercicion2herencia;

/**
 *
 * @author usuario
 */
public class Lavadora extends Electrodoméstico{

    private  int carga;

    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }

    

    public Lavadora(double precio, String color, char consumoe, double peso, int carga) {
        super(precio, color, consumoe, peso);
        this.carga= carga;
    }
    
    @Override
    public double precioFinal(){
        
        double aumento = super.precioFinal();
        if (carga>30) {
            
            aumento+=500;
        }
        return  aumento ;
    }
    
}
