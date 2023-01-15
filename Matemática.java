/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion9poo;

import java.util.regex.MatchResult;

/**
 *
 * @author usuario
 */
public class Matemática {
    private double numero1;
    private double numero2;

    public Matemática() {
        
        
    }

    public Matemática(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
 
     
    
 
    public void devolverMayor(){
        
        
        System.out.println("El mayor valor de los 2 atributos(numero1 y numero2) es: "+Math.max(numero1, numero2));
        
     
    }

   
    public void  calcularPotencia(){
        
        System.out.println("El rendondeo del numero1 es: "+Math.round(numero1));
        
           System.out.println("El rendondeo del numero2 es: "+Math.round(numero2));
           if (numero1>numero2) {
            
        
        System.out.println("La potencia del mayor Valor es: "+Math.pow(Math.round(numero1), Math.round(numero2)));
           }
           else  {
            System.out.println("La potencia del mayor Valor es: "+Math.pow(Math.round(numero2), Math.round(numero1)));
        }
        
    }
    
    
    public void calculaRaiz(){
        if (numero1>numero2) {
            
        
        System.out.println("El valor absolucto del Numero: "+Math.abs(numero2));
            System.out.println("La raiz cuadrada del menor de los 2 valores es: "+Math.sqrt(Math.abs(numero2)));
        }
        else {
            System.out.println("El valor absolucto del Numero: "+Math.abs(numero1));
            
               System.out.println("La raiz cuadrada del menor de los 2 valores es: "+Math.sqrt(Math.abs(numero1)));
        }
        
        
        
        
        
    }
    
    
    
    

    
}
