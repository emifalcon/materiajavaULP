/*
e
 */
package ejercicion2herencia;

/**
 *
 * @author usuario
 */



public class Televisor extends  Electrodoméstico{

    
    private double resolucion;
    
    private boolean  sintonizadorTDT;

    @Override
  public double  precioFinal(){
      
      double elaumento = super.precioFinal();
      if (resolucion>40) {
          elaumento += (this.getPrecio() * 0.3);
      }
        if (sintonizadorTDT) {
            elaumento +=  500 ;
        }
      return elaumento ;
  }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }
    
    
    public Televisor(float resolucion, boolean sintonizadorTDT, double precio, String color, char consumoe, double peso) {
        super(precio, color, consumoe, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
}
