/*

5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta




*/

package ejercicion5poo;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicion5poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int operacion;
        Cuenta datos = new  Cuenta();
  
        datos.cuenta();
  
        System.out.println(datos);
        System.out.println("            ");
        
        do{
        System.out.println("Operaciones: "+
                      " 1.ingresa dinero "+
                      " 2. Retirar dinero "+
                      " 3. Extraccion Rapida "+
                      " 4. Consultar Saldo "+
                      " 5. Consultar Datos de la cuenta "+
                      " 6. Salir de la Operacion ");
     
           Scanner entrada = new Scanner(System.in);
            System.out.println("           ");
             System.out.println("Selecccione la Operacion: ");
                    operacion = entrada.nextInt();
        
                             
          
          switch (operacion) {
            case 1:
                
                System.out.println("La suma total con el ingreso + el saldo actual: "+datos.ingresar());
     break;
            case 2:
        System.out.println(datos.retirar());
            
           break;     
            case 3:
        System.out.println("La extraccion de en la cuenta fue de: "+datos.extraccionRapida());
        break;
            
            case 4:       
            
        System.out.println("El saldo disponible de la cuenta es de: "+datos.consultarSaldo());
        break;
        
            case 5:
        System.out.println("Los datos de la cuenta : "+datos.consultarDatos());
        break;
        case 6:
            System.out.println("Fin de la Operacion");
            break;
          }
        }while (operacion >0 && operacion <7 && operacion !=6);
      
        }
    }

 
    
   

    

  
    
    
    

