

import java.util.Scanner;


/*
21. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido.



*/



/**
 *
 * @author usuario
 */
public class Ejericicion21ulp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      
      int N = entrada.nextInt();
      
      int [] vector = new int[N];
     //int ValorA =  entrada.match(random()* N);
        
     int repeticion = 0;
       
        
        for (int i = 0; i < N; i++) {
     
           vector[i] = (int)(Math.random()*N) ;
       
        }
        
        for (int i = 0; i < N; i++) {
            
            System.out.println("El llenado de los valores aleatorios "+i+" : "+vector[i]);
            
            
        }
        System.out.println("El numero a buscar: ");
        int buscar = entrada.nextInt();
        for (int i = 0; i < N; i++) {
            
            if (vector[i] == buscar) {
                
                System.out.println("El numero a buscar "+buscar+" se ubica dentro de la posicion: "+i);
               repeticion++;
                
            }
                
            }
            if (repeticion>1 ) {
                
                System.out.println(" Se Repite los valores aleatorios. ");
                
            }
           
            
            
            
            
            
            
            /*else{
                
            
           /* Map<Integer, Integer> repetir = new HashMap<>();
            
            for (int j = 0; j < N; j++) {
                
             repetir.equals(buscar);
           if (repetir.containsKey(i)) {
             
                repetir.put(i, repetir.get(i) + 1);
                 System.out.println("Si se encuentra Repetido. "+repetir); 
                //System.out.println("Se repite el mismo valor aleatorio. "+buscar);
            
        }*/
            
        
    }
       
      
}
