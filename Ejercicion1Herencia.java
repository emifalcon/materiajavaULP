/*
1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente:
 */
package ejercicion1herencia;

/**
 *
 * @author usuario
 */
public class Ejercicion1Herencia {


    public static void main(String[] args) {
      
       Perro perro = new Perro("boby", "menudo", 15, "Labrador retriever");
        
        perro.Alimentarse();
        System.out.println(" ");
        System.out.println("......................");
        System.out.println(" ");
        Perro perro1 = new Perro("Toby", "pollo", 8, "Poodle");
        perro1.Alimentarse();
        System.out.println(" ");
        System.out.println(".......................");
        System.out.println(" ");
        Gato gato = new Gato("michi", "croqueta", 7, "RagDoll");
        gato.Alimentarse();
        System.out.println(" ");
        System.out.println("******************************");
        System.out.println(" ");
        Caballo caballo = new Caballo("Pegaso", "pasto", 20, "Criollo");
        caballo.Alimentarse();
        
    }
    
}
