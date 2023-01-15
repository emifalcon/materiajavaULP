
import java.util.Scanner;

/*
27
14. Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.


*/
 


/**
 *
 * @author usuario
 */
public class EjercN14ulp {
    @SuppressWarnings("null")
    public static void main(String[] args) {
       Scanner entrada = new  Scanner(System.in);
        int num1,num2,opcion,suma = 0,resta=0;
        float division=0,mult=0;
        String salir = null  ;
        
        do {            
           do { 
        System.out.println("Digite los numeros enteros: ");
        num1 = entrada.nextInt();
     num2 = entrada.nextInt();
          
            System.out.println("Menu"
                    +" 1.Suma"
                    +" 2. Resta"
                    +" 3. Multiplicar"
                    +" 4. Division "
                    + "5. Salir  ");
            opcion = entrada.nextInt();
            switch (opcion) {
                
                case 1:
                    
                    suma = num1 + num2;
                    System.out.println("La Suma es : "+suma);
                    break;
                case 2:
                   
                    resta = num1 - num2;
                     System.out.println(" La resta es: "+resta);
                    break;
                case 3:
                    mult = num1 * num2;
                       System.out.println("La Multiplicacion es: "+mult);
                   break;
                case 4:
                    
                    division = num1 / num2;
                    System.out.println("La division es: "+division);
                    break;
                                        
                        
                    
                case 5:
                       
                 System.out.println(" ¿Está seguro que desea salir del programa (S/N)? ");
                       salir = entrada.next();  
                       if (salir.equals("S")) {
                        break;
                    }
                 }      

        
       
        } while ( opcion == 1 || opcion == 2 || opcion ==3 || opcion == 4);
           
           
         }while (salir.equals("N")); 
        }
}
    

/*if (opcion == 5) {
                        
                    
                   System.out.println(" ¿Está seguro que desea salir del programa (S/N)? ");
                       salir = entrada.next();
                      if (salir.equals("s")) {
                        break;
                    }
                    }
*/