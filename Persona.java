/*

 */
package ejercicion12poo;


import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Persona {
    
    private String nombre;
    
    private Date fnacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fnacimiento) {
        this.nombre = nombre;
        this.fnacimiento = fnacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(Date fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fnacimiento=" + fnacimiento + '}';
    }
    
    
    
    
    public void crearPersona(){
        
        Scanner entrada  = new Scanner(System.in);
        
        System.out.println("Cual es tu nombre? ");
        nombre = entrada.next();
        System.out.println("Cual es tu Fecha de nacimiento? ");
        System.out.println("Ingrese el dia:");
        int dianacimiento = entrada.nextInt();
        System.out.println("Ingrese el mes :");
        int mesnacimiento = entrada.nextInt()-1;
        System.out.println("Ingrese el anio :");
        int añonacimiento = entrada.nextInt()-1900;
         fnacimiento = new Date(añonacimiento, mesnacimiento, dianacimiento);
        System.out.println("La fecha de nacimiento es :"+fnacimiento);
        
        
    }
    public int calcularEdad(){
        

        Date factual = new Date();
        
        System.out.println("fecha actual: "+factual);
        
        int diferencia = fnacimiento.getYear()-factual.getYear();
        
        System.out.println("La edad de la perosna es: "+ Math.abs(diferencia));
        return Math.abs(diferencia);
    }
    
    
    
    
    public  boolean menorQue(int edad){
         
        return  edad>calcularEdad();
      
    }

 public  void mostrarPersona(){
     
     System.out.println("La informacion de la persona creada : \n Nombre: "+nombre+
             "\n Fecha de Nacimiento: "+fnacimiento);
          
     
     
     
 }

  




}