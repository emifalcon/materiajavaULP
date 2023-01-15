/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion8poo;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Cadena {
    private String frase1;


    public Cadena(String frase1) {
        this.frase1 = frase1;
    }

    Cadena() {
        
    }

  
    
    
    
    
    

    void setfrase1(String palabra) {
        
    }

    void setLoght(int longt) {
       
    }
    
    
    
    public String getFrase1(){
        
        return frase1;
    }

   public void setmostrarVocales(String frase1){
     
       
       String vocales= "aeiou";
     int cantidadvocales=0;
     int contador[]={0,0,0,0,0};      
       for (int i = 0; i < frase1.length(); i++) {
           for (int j = 0; j < vocales.length(); j++) {
               
               if (frase1.charAt(i)==vocales.charAt(j)) {
                   
                   contador[j]++;
                  
               }
               
           }
       } System.out.println("La cantidad de veces que se repite en cada vocal de la frase : " );
       for (int i = 0; i < vocales.length(); i++) {
           
       
        System.out.println(vocales.charAt(i)+" : "+contador[i]);
        cantidadvocales+=contador[i];
        
       }
       System.out.println("La cantidad de vocales que contiene la frase ingresada:  "+cantidadvocales);
      
   }
   
   
   
   
   
    
    public void invertirFrase(String frase1){
        
        System.out.println("La frase ingresada de forma Invertida: ");
        
        for (int i = frase1.length()-1; i>=0; i--) {
            
            
            frase1 = frase1 + frase1.charAt(i);
            
       System.out.print(frase1.charAt(i)+"   ");
        }
           
        
        
        
        
    }
    
    public void vecesRepetido(String frase1){
        Scanner entrada = new Scanner(System.in);
        System.out.println("             ");
        System.out.println("Ingrese el caracter preferido; ");
        String caracter = entrada.next();
        int Repetido=0;
         for (int i = 0; i < frase1.length(); i++) {
           for (int j = 0; j < caracter.length(); j++) {
               
               if (frase1.charAt(i)==caracter.charAt(j)) {
                   
                   Repetido++;
                  
               }
               
           }
         
        
    }
    
        System.out.println( "El caracter "+caracter+" se repite: "+Repetido);
    
    }
    
    public void compararLongitud(String frase1){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa otra frase para comparar: ");
        
        String frase02 = entrada.next();
        
        for (int i = 0; i < frase1.length(); i++) {
            for (int j = 0; j < frase02.length(); j++) {
              
      
            }
        }
        
        if (frase1.length()==frase02.length()) {
                    System.out.println("La longitud entre las 2 Frases son identicas. ");
                }else{
                    System.out.println("La longitud entre las 2 frases son Diferentes. ");
                    
                }
        
    }
    
    
    public void unirFrases(String frase1){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la nueva frase  por el usuario: ");
        String fraseunida = entrada.next();
        
        System.out.println("la frase de cadena + la frase nueva: "+frase1+" "+fraseunida);
        
        
    }
    
    public void reemplazar(String frase1){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la letra de reemplazo: ");
        String reemplazo = entrada.next();
        
        
        System.out.println("La frase resultante modificada : "+frase1.replaceAll("a", reemplazo));
    
        
    }
    
    
    public boolean contiene(String frase1){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la letra para comprobar: ");
        String comprobar = entrada.next();
        
        int resultado = 0;
        for (int i = 0; i < frase1.length(); i++) {
            for (int j = 0; j < comprobar.length(); j++) {
                
                if (frase1.charAt(i)==comprobar.charAt(j)) {
                    
                   resultado++;
                    
                }
                
                
            }
        }
        if (resultado>0) {
            
        
        return true;
        
        
        }else {
            
          return  false;
            
        }
            
        
    }
    
    
    
    
    

    void setmostrarVocales(int longt) {
       
    }

  
    
    
    
    
    
    
    
       
}
