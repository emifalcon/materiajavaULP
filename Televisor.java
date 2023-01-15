/*
e
 */
package ejercicion3herencia;

/**
 *
 * @author usuario
 */



public class Televisor extends  Electrodoméstico{

    
    private float resolucion;
    
    private boolean  sintonizadorTDT;

    public Televisor() {
    }
    
    
    

    public float getResolucion() {
        return resolucion;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
    
    @Override
  public double  precioFinal(){
      
      double elaumento = super.precioFinal();
      if (resolucion>40) {
          elaumento += (this.precio * 0.3);
      }
        if (sintonizadorTDT==true) {
            elaumento +=  500;
        }
      return elaumento ;
  }

  
  
    @Override
    public String toString() {
        return "Televisor " + "resolucion: " + resolucion + ", sintonizadorTDT: " + sintonizadorTDT ;
    }
    
    
    public Televisor(float resolucion, boolean sintonizadorTDT, double precio, String color, char consumoe, double peso) {
        super(precio, color, consumoe, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
}
