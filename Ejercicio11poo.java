/*

11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle


 */
package ejercicio11poo;




import java.time.LocalDate;
import java.time.Period;

import java.util.Scanner;


/**
 *
 * @author usuario
 */
public class Ejercicio11poo {

    
    public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);

 
  System.out.println("Ingrese el fecha seleccionada: ");
        
        
        System.out.print("Ingrese el dias: ");
        int dia = entrada.nextInt();
  
        System.out.print("Ingrese el mes: ");
        int mes = entrada.nextInt();
        
        System.out.print("Ingrese el anio:  ");
      int anio = entrada.nextInt();
      
      
        LocalDate fechaindicada =  LocalDate.of(anio, mes, dia);
  
        System.out.println("La fecha ingresada por el usuario es: "+fechaindicada);
    
  
  
  LocalDate factual = LocalDate.now();
  
        System.out.println("La fecha Actual es: "+factual);
  
  Period periodo = Period.between(fechaindicada, factual);
  
        
        System.out.println("La diferencia entre los anios que existe entre la fecha ingresada y la fecha Actual es : "+periodo.getYears()+" anios, "+periodo.getMonths()+" meses y "+periodo.getDays()+" dias.");


        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    private static class Date {

      

        private Date() {
         
        }
        
        
        
        
        
    }

   

  

  

   

  
    
}
