
import java.util.Scanner;

/* 16. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario.


Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.



Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. 

Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().



*/

/**
 *
 * @author usuario
 */
public class Ejercicion16ulp {
    public static void main(String[] args) {
       Scanner entrada = new  Scanner(System.in);
        String usuario, FDE ;
        int contC=0,contI=0;
        do {            
           
        
        System.out.println("Digite una cadena: ");
        usuario = entrada.next();
        
      int cantidad = usuario.length();
      
       if(cantidad <=5){
           
            usuario.substring(0, 4);
        
        if (usuario.startsWith("X")&& usuario.endsWith("O")) {
            System.out.println("El formato se considera correcta. ");
             contC++;
        }
        }   
            System.out.println("Digite la secuencia especial: ");
       FDE = entrada.next();
            
      if( FDE.equals("&&&&&")){
         break;
          
      }else{
          
          contI++;
      }
       
       
       }while (FDE !="&&&&&"); 
        System.out.println("la cantidad de lecturas correctas: "+contC +" e incorrectas recibidas: " +contI );
      
        
    }
}
