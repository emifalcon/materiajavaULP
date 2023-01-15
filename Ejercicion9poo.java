/*
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejercicion9poo;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicion9poo {

  
    public static void main(String[] args) {
        
        
        Matemática operaciones = new Matemática();

        for (int i = 0; i < 10; i++) {
            
          double   numero1=  ((Math.random()*10)+1);
            operaciones.setNumero1(numero1);
            double   numero2=  ((Math.random()*10)+1);
            operaciones.setNumero2(numero2);
        }
        System.out.println("El numero1 creado aleatoriamente:  "+operaciones.getNumero1());
        System.out.println("El numero2 creado aleatoriamente:  "+operaciones.getNumero2());
        
        operaciones.devolverMayor();
        
        //////////////////////
        
        
        operaciones.calcularPotencia();
        
        
        
        //////////////
        
        operaciones.calculaRaiz();
        
        
    }
    
}
