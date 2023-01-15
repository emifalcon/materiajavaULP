/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion5poo;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Cuenta {
    
    private int numerocuenta;
    private long dni;
    private int saldo ;
    private float interes;

    public Cuenta() {
        
        
    }
 
   

    public Cuenta(int numerocuenta, long dni, int saldo, float interes) {
        this.numerocuenta = numerocuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.interes = interes;
    
    }
    
    
    
    
 


  
    public void cuenta(){
        
        Scanner entrada= new Scanner(System.in);
      
        System.out.println("Ingrese el DNI: ");   
        dni= entrada.nextLong();
        System.out.println("Ingrese el numero de Cuenta: ");
        numerocuenta = entrada.nextInt();
        System.out.println("Ingrese el saldo: ");
        saldo = entrada.nextInt();
        System.out.println("Ingrese el interes: ");
        interes = entrada.nextFloat(); 
 
           
       
      
        
       
    }

    
    
    
    
    
    
    
    
    
    
   

   public double ingresar(){
       
    
 Scanner entraada = new Scanner(System.in);

         
        System.out.println("Ingrese la cantidad de dinero a ingresar en el saldo: ");
        double cantidad = entraada.nextDouble();
        
        
    return saldo = (int) (saldo + cantidad);
  
   }
    



  

    
    public double retirar(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el dinero a retirar del: ");
        int retiro = entrada.nextInt();
        if (saldo>retiro) {
            System.out.println("El total del dinero disponible luego del retiro: ");
            
        return saldo = saldo-retiro;
          
        }else {
            System.out.print("El saldo actual en ");
            return saldo = 0;
        }
        
    }
    
    public double extraccionRapida(){
        
        Scanner entrada = new Scanner(System.in);
     
       System.out.println("Ingrese el porcentaje de extraccion: ");
        double porcentaje = entrada.nextDouble();
        if (porcentaje==20) {
              
         return  saldo = (int) ((saldo /100)*porcentaje);
        }else{
            System.out.print("El usuario no puede sacar mas del 20%: ");
            return 0;
        }
        
          
    }

    @Override
    public String toString() {
        return "Cuenta:" + "numerocuenta=" + numerocuenta + ", dni=" + dni + ", saldo= " + saldo + " interes=" + interes  + '}';
    }

   
 
    
    
    public  int consultarSaldo(){
  
        return saldo ;
 
        
    }
    
    public String consultarDatos(){
        
      return "dni: "+dni+" saldo: "+saldo+" numero de cuenta: "+numerocuenta+" interes: "+interes;
        
    }

  

  
   
 
}


