/*
 12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle.
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package ejercicion12poo;


import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicion12poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Persona edaddePersona = new Persona();
       
       
       edaddePersona.crearPersona();
        
        edaddePersona.calcularEdad();
        
        Scanner entrada = new Scanner(System.in);
         System.out.println("Ingrese la edad de la otra persona: ");
        int edad = entrada.nextInt();
        if (edaddePersona.menorQue(edad)) {
            
            System.out.println("la persona actual es menor de la que acaba de ingresar. ");
            
        }else  {
            
             System.out.println("la persona actual es mayor de la que acaba de ingresar. ");
            
            
        }
 
        
        edaddePersona.mostrarPersona();
        
        
        
    
    
}
    
}
