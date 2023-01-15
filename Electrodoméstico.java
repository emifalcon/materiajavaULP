/*

 */
package ejercicion2herencia;

import java.util.Scanner;

/**
 *
 * @author usuario
 */



public class Electrodoméstico {
 
    protected  final static String COLOR_STRING= "blanco";
     protected  final static char Consumo_Energetico_Defecto= 'F';
     protected  final static double Precio_Base_Defecto=100;
      protected final static double PESO_DEFECTO = 5;
      
    double precio;
    private String color;
    private char consumoe;
    private double peso;

    public Electrodoméstico() {
    }

    public Electrodoméstico(double precio, String color, char consumoe, double peso) {
       
        this.precio = precio;
        this.peso = peso;
        comprobarColor(color);
        ComprobarConsumoEnergetico(consumoe);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoe() {
        return consumoe;
    }

    public void setConsumoe(char consumoe) {
        this.consumoe = consumoe;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
        private  void ComprobarConsumoEnergetico(char consumoe){
        Scanner entrada = new Scanner(System.in);
        
        if (consumoe>=65 && consumoe<=70) {
                this.consumoe = consumoe;
            }else {
            
            this.consumoe = Consumo_Energetico_Defecto;
        }
        
    }
    
    private final void comprobarColor(String color ){
        String colores[] = {"blanco","azul","negro","rojo","gris"};
        
        boolean encontrado = false;
        
        for (int i = 0; i < colores.length && !encontrado; i++) {
            if (colores[i].equals(color)) {
                encontrado = true;
            }
        }
        
        if (encontrado) {
            this.color = color;
            
        }else{
            
            this.color = COLOR_STRING;
        }
        
    }

    @Override
    public String toString() {
        return "Electrodom\u00e9stico{" + "precio=" + precio + ", color=" + color + ", consumoe=" + consumoe + ", peso=" + peso + '}';
    }
    
    
  
    
    public double  precioFinal(){
        
        double aumento =0;
        double aumento2 = 0;
        switch (consumoe) {
            case 'A':
                aumento+=1000;
                break;
            case 'B': 
            aumento+=800;
            break;
            
            case 'C':
              aumento+=600;

            break;
            
            case 'D':
                
                aumento+=500;
                
            break;
            
            case 'E':
            aumento+=300;
            break;
            
            case 'F':
            aumento+=100;
            break;
            
        }
        if (peso >=1 && peso<=19) {
            aumento2+=100;
        }else if (peso>=20 && peso<=49) {
            aumento2+=500;
        }else if(peso>=50 && peso<=79){
            aumento2+=800;
            
        }else if(peso>=80){
            
            aumento2+=1000;
        }
        return precio + aumento + aumento2;
    }
        
        
}
