
package ejercicion1relacionesclases;

import java.util.Scanner;

/**
 *Persona con atributos: nombre, apellido, edad, documento y Perro.
 *
 */
public class Persona {
   
    private String nombre;
    
    private String apellido;
    
    private int edad;
    
    private int dni;
    
    private Perro perro;

    public Persona() {
        
    }

    public Persona(String nombre, String apellido, int edad, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

 
    
    
    public void mostrarPersonaConElPerro(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre y apellido: ");
        
        nombre = entrada.next();
        apellido = entrada.next();
        
        System.out.println("Ingrese la edad: ");
        edad = entrada.nextInt();
        System.out.println("Ingrese el dni: ");
        dni = entrada.nextInt();
        System.out.println("       ");
        System.out.println("Persona: "+nombre+" "+apellido); 
        
        System.out.println("Edad: "+edad);
        
        System.out.println("dni: "+dni);
        
        System.out.println("el perro asignado es: "+perro.getNombre()+" raza: "+perro.getRaza());
        
        System.out.println("Edad: "+perro.getEdad()+" el tamanio: "+perro.getTamanio());
    }

   
    
    
    
    
}
