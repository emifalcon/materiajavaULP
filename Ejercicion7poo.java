/*
7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.


 */
package ejercicion7poo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Ejercicion7poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Persona personanull = new Persona();
         try{ personanull = null;
        personanull.esMayorDeEdad();
         }catch(NullPointerException expcepcion1){
              JOptionPane.showMessageDialog(null, " Se ha leido  la Excepcion. ");
         }finally{
             
         }
      Persona p1 = new Persona();
     
            
 p1.crearPersona();
        
 
        double p1mc = p1.calcularIMC();
          
        
        boolean p1Medad = p1.esMayorDeEdad();
            
          

      
      
      Persona p2 = new Persona();
      
         p2.crearPersona();
     
        double p2mc = p2.calcularIMC();
        
      
      
       boolean p2Medad= p2.esMayorDeEdad();


            
         
            
        
      
      Persona p3 = new Persona();
      
      p3.crearPersona();
      
        double p3mc=p3.calcularIMC();
        
        boolean p3Medad= p3.esMayorDeEdad();
      
      
       

            
             
  Persona p4 = new Persona();
      
      
      
      p4.crearPersona();
        
        
     double p4mc = p4.calcularIMC();
        
     boolean p4Medad= p4.esMayorDeEdad();

       int debajopeso=0;
       int pesoideal=0;
       int sobrepeso=0;
 
            
            
            if (p1mc==-1) {
               
                debajopeso++;
                       
             
             
        }
            else if (p1mc==0) {
                
            pesoideal++;
            
        }
            else if (p1mc==1) {
                
               sobrepeso++; 
            
            
        }else{
            System.out.println("ninguno es un peso.");
        }
           if (p2mc==-1) {
            
            debajopeso++;
            
            
        }else if (p2mc==0) {
            
            pesoideal++;
            
        }else if(p2mc==1){
            
            sobrepeso++;
            
            
        }else{
            System.out.println("ninguno es un peso.");
        }
           
        if(p3mc==-1){
            
          debajopeso++;
            
        }else if(p3mc==0){
            
            
           pesoideal++; 
            
        }else if(p3mc==1){
            
            sobrepeso++;
            
        }else{
            System.out.println("ninguno es un peso.");
        }
        
        
        if(p4mc==-1){
            
            debajopeso++;
            
        }else if(p4mc==0){
            
            pesoideal++;
            
        }else if(p4mc==1){
            
           sobrepeso++; 
        }else{
            System.out.println("ninguno es un peso.");
        }
 
      
        
      
      System.out.println("El porcentaje debajo de peso es: "+debajopeso*100/4);
        System.out.println("El porcentaje peso ideal  es: "+pesoideal*100/4);
        System.out.println("El porcentaje sobrepeso  es: "+sobrepeso*100/4);
        
        
        
        
        int mayordedad = 0;
        
         if (p1Medad==true) {
               
                mayordedad++;
                               
        }
           if (p2Medad==true) {
                
            mayordedad++;
            
        }
             if (p3Medad==true) {
                
               mayordedad++; 
            
            
        }if (p4Medad==true) {
            
            mayordedad++;
        }
            
          
        
       int menordedad = 0;
        
         if (p1Medad==false) {
               
                menordedad++;
                               
        }
           if (p2Medad==false) {
                
            menordedad++;
            
        }
             if (p3Medad==false) {
                
               menordedad++; 
            
            
        }if (p4Medad==false) {
            
            menordedad++;
        }
            
           
          System.out.println("El porcentaje de los mayores de edad es: "+mayordedad*100/4);
          System.out.println("El porcentaje de los menores de edad es: "+menordedad*100/4);
        
      
       
       
       
       
       
       
       
       
       
        } 
        
    }

      
     
      
      
      
      
      
      
      
      
//      int infrapeso =0;
//      int pesoideal=0;
//      int sobrepeso=0;
//        
//            
//        for (int i = 0; i <4; i++) {
//            
//        
//        if (p1.calcularIMC()==-1 || p2.calcularIMC()==-1 || p3.calcularIMC()==-1 || p4.calcularIMC()==-1) {
//            
//             infrapeso++;
//        }else if (p1.calcularIMC()==0 || p2.calcularIMC()==0 || p3.calcularIMC()==0 || p4.calcularIMC()==0) {
//            pesoideal++;
//            
//        }else if (p1.calcularIMC()==1 || p2.calcularIMC()==1 || p3.calcularIMC()==1 || p4.calcularIMC()==1) {
//               sobrepeso++; 
//        }
//        }
//        
//        int medad=0;
//        for (int i = 0; i < 4; i++) {
//            
//        
//            
//            
//            if (p1.esMayorDeEdad()==true || p2.esMayorDeEdad()==true || p3.esMayorDeEdad()==true || p4.esMayorDeEdad()==true) {
//                
//            medad++;
//           
//        }
//            
//        }    
//        double porcentaje =4;
        
        
//        System.out.println("El porcentaje debajo de peso es: "+infrapeso*100/porcentaje);
//        System.out.println("El porcentaje pesoideal de peso es: "+pesoideal*100/porcentaje);
//        System.out.println("El porcentaje sobrepeso de peso es: "+sobrepeso*100/porcentaje);
//        System.out.println("El porcentaje de los mayores de edad es: "+medad*100/porcentaje);
        
        
        
      
//        Persona caracteristicas = new Persona();
//        
//        caracteristicas.crearPersona();
//        
//        System.out.println(caracteristicas);
//        if (caracteristicas.calcularIMC()<20) {
//            
//    System.out.println("La persona esta por debajo del peso ideal. "+-1);
//    
//        }else if (caracteristicas.calcularIMC()>=20 && caracteristicas.calcularIMC()<=25) {
//            System.out.println("La persona esta en su peso ideal "+0);
//            
//         
//        }else{
//            
//            System.out.println("La persona tiene Sobrepeso. "+1);
//            
//        }
//        
        
        
        
        
        
        
        
        
        
        
    
    

        
    
