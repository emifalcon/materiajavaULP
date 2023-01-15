
 
package ejercicion4poo;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Rectangulo {
    
    
    private int base;
    
    private int altura;

  

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
      
    }
   
   

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
   
    
    public void crearRectangulo(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la base: ");
        base = entrada.nextInt();
        
        System.out.println("Ingrese la altura: ");
        altura = entrada.nextInt();
           
        
      
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura +'}';
    }
    
    
    
    
    public double superficie(){
        
        return base * altura;
 
    }
    
    public double perimetroR (){
        
      return (base + altura) * 2;  
          
    }
    
    
    public String astericos(){
        
        
       // Base Superior:
          for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }
          System.out.println("  ");
          
          
         //Centro laterales:
       
            for (int j = 0; j < altura; j++) {
                System.out.print("*");
            
            for (int l = 1; l < base-1; l++) {
                  System.out.print("  ");
                  
              }
               
            System.out.println(" *");
            }
         //Base Inferior:
         for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }
        System.out.println("  ");
        return " ";
        
    }
    
    
    
    
    
    
}


//// Base Superior:
//          for (int i = 0; i < base; i++) {
//            System.out.print("* ");
//        }
//          System.out.println("  ");
//          
//          
//         //Centro laterales:
//       
//            for (int j = 0; j < altura; j++) {
//                System.out.print("*");
//            
//            for (int l = 1; l < base-1; l++) {
//                  System.out.print("  ");
//                  
//              }
//               
//            System.out.println(" *");
//            }
//         //Base Inferior:
//         for (int i = 0; i < base; i++) {
//            System.out.print("* ");
//        }
//        System.out.println("  ");