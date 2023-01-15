/*
8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:

• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.

• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.

• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.

• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.

• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.


*/
 
package ejercicion8poo;


import java.util.IllegalFormatFlagsException;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicion8poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Cadena lafrse = new Cadena();
        int longt;
        
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una frase: ");
        String palabra = entrada.next();
        
        longt= palabra.length();
        lafrse.setmostrarVocales(palabra);
        lafrse.setmostrarVocales(longt);
        System.out.println(lafrse.getFrase1());
        
        ////////////
        lafrse.invertirFrase(palabra);
        //////////
        
        lafrse.vecesRepetido(palabra);
       
        ////////////
        
        lafrse.compararLongitud(palabra);
        
        //////////////
        
        lafrse.unirFrases(palabra);
        
        //////////////
        
        lafrse.reemplazar(palabra);
        
        ////////////
        
            System.out.println(lafrse.contiene(palabra));
        
//        Cadena l1 = new Cadena();
//        String frase;
//        Scanner leer = new Scanner(System.in);
//        
//        System.out.println("Ingrese una frase: ");
//        frase = leer.next();
//        l1.setFrase(frase);

        
        
        
        
        
        
        
    }
    
}
