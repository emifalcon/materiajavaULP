/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion10poo;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class Arreglos {
    private float arregloA[]= new float[50];
    
    private float arregloB[]= new float[20];

    public Arreglos() {
        
        
    }

  

    public float[] getArregloA() {
        return arregloA;
    }

    public void setArregloA(float[] arregloA) {
        this.arregloA = arregloA;
    }

    public float[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(float[] arregloB) {
        this.arregloB = arregloB;
    }



    
    
    

    @Override
    public String toString() {
        return "Arreglos{" + "arregloA=" + arregloA + ", arregloB=" + arregloB + '}';
        
    }

    
  
    
   public void incializar(){
       
    
           for (int i = 0; i < arregloA.length; i++) {
           arregloA[i] =  (float) ((Math.random()*10)+1);
              
    }
         
      System.out.print(Arrays.toString(arregloA));
       System.out.println("       ");
        Arrays.sort(arregloA);
        
        System.out.println(Arrays.toString(arregloA));

        
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
  
           
               
               
    
            Arrays.fill(arregloB, 10, 20,(float)0.5);
  
             
           //Arrays.fill(arregloB, 0, 9, i);
           
             
            
         System.out.println(Arrays.toString(arregloB));

         
   }

 


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
