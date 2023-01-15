package ejercicion2Javacolecciones;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicion2JavaColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
   String opcion;
        ArrayList<String> razasperros = new ArrayList();
        
        
      do{
          
          System.out.println("Ingrese una raza de perro: ");
          String perros = entrada.nextLine();
          razasperros.add(perros);
          
          System.out.println("Quiere agregar otra raza de perro? opciones: Si o No ");
          opcion = entrada.nextLine();
          
          
          
      }while (opcion.equalsIgnoreCase("s")); 
        
        for (String RazasPerros : razasperros) {
            
            System.out.println(RazasPerros);
              
        }
        System.out.println("Ingrese la raza de perro que este en la lista: ");
        String nuevoperro = entrada.next();
        
        
        
        Iterator < String > it = razasperros.iterator();
        
       
         int cont = 0;
         
        while (it.hasNext()) {      
            
         String nombres = it.next();
       
  if (nombres.equalsIgnoreCase(nuevoperro)) {
      
    it.remove();
    cont ++;
      
      
  
  }
        }
  
            if (cont !=0) {
                System.out.println(" Se elimino el perro ingresado:  "+razasperros);
            } else {
                System.out.println("El perro no se encuentra en la lista. ");
   System.out.println(razasperros);
   
            
        }

    
        
       
       
    }
}
    



// if (!nombres.equals(nuevoperro)) {
//
//                 System.out.println("El perro no se encuentra en la lista. ");
//                 System.out.println(razasperros);
//
//             }

//for (String nombres : razasperros) 
//           
// System.out.println(nombres); 
//            
//            
//        }
        //System.out.println("La raza de perro seleccionado No existe.");
//for (String nombres : razasperros) 
//           
// System.out.println(nombres);

        
    
