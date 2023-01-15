/*

*/
 
package ejercicion7poo;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Persona {
    
   private String nombre;
   
   private int edad;
   
   private String sexo;
   
   private float peso;
   
   private float altura;

    public Persona() {
        
    }

    public Persona(String nombre, int edad, String sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
   
   public void crearPersona(){
       Scanner entrtada = new Scanner(System.in);
       
       System.out.print("Ingrese el nombre: ");
        nombre = entrtada.next();
       System.out.print("Ingrese la edad: ");
        edad = entrtada.nextInt();
       System.out.println("Ingrese el sexo: M:mujer,H:hombre o O: otros. ");
        sexo = entrtada.next();
      if (sexo.equals("M") || sexo.equals("H") || sexo.equals("O")) {
          System.out.println(" el tipo de sexo introducido es Correcto.");
       }else{
           
           System.out.println("El tipo de sexo selecccionado es Incorrecto.");
           
       }
       
       System.out.print("Ingrese el peso: ");
        peso = entrtada.nextFloat();
     
       
       System.out.println("Ingrese la altura: ");
        altura = entrtada.nextFloat();
       
       
   }

   
    
 public double calcularIMC() {
  
     
     
     
     

 double pesada= peso/(altura*altura);

 
 if (pesada < 20) {
     System.out.println("La persona esta debajo del peso ideal.");
           return -1;
        }else if(pesada >= 20 && pesada <= 25) {
            System.out.println("La persona tiene el peso Ideal.");
             return 0;
        }else  {
         System.out.println("La persona tiene sobrepeso.");
           return 1;
     }
        
        
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

  
     
  
 
 
 
 
 
 
    
    public boolean esMayorDeEdad(){
       
   
        if (edad>17) {
            System.out.println("La persona  es mayor de edad. ");
            
       return true ;
        }else{
            System.out.println("La persona  No es mayor de edad. ");
            return  false;
        }   
        
        
    }

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
