


import java.util.Scanner;


/*
24. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).


*/
 

/**
 *
 * @author usuario
 */
public class EjercicioN24Ulp {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
       int filas= 3, columnas= 3;
        boolean resultadO = false;
       int  matriz[][] = new int [3][3]; 
      
       int matrice1[][]= new int[3][3];
        // System.out.println("El llenado de la matriz: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
              //  System.out.print("Matriz: ["+i+"] ["+j+"]:  ");
             //matriz[i][j]= entrada.nextInt();
      matriz[i][j]= (int)(Math.random()*(10+10+1)-10) ;
                
                
            }
        }
        
        System.out.println(" ///////////////////////////////// ");
        for (int i = 0; i < filas; i++) {
            
            for (int j = 0; j < columnas; j++) {
                
                System.out.print(" "+matriz[i][j]+" ");
               //  matrice1[i][j]= matriz[i][j];
                 
            }
             System.out.println("");
        }
          
       
        System.out.println(" Transpuesta de la Matriz: ");//matriz se coloca = signo negativo.
        
        
       for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {  
                
                System.out.print(" "+matriz[j][i]+" ");
                
              //matrizas2[j][i]= matriz[j][i]*(-1);
              
                }
            System.out.println(" ");
            }
        
       for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {  
                
               // matrice1[i][j]= matriz[i][j];
                
            //  matrizas2[j][i]= matriz[j][i]*(-1);
              
              if ((matriz[i][j]+(matriz[j][i]*(-1))) !=0) {
            resultadO= false;
        }else{
                  resultadO=true;
                  
                  
              }
                }
            
            }
       
      
       
        if (resultadO==true) {
            System.out.println("La matriz es Anti asimetricas. "+resultadO);
            
        }else{
            System.out.println("No es la matriz Anti asimetricas");
            
        }
        
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       /* if (Arrays.deepEquals(matrice1, matrizas2)) {
            
        

        System.out.println("Es una Matriz Antisimetrica"+Arrays.deepEquals(matrice1, matrizas2));
        }else if (!(Arrays.deepEquals(matrice1, matrizas2))) {
            
        
        
        System.out.println("No es una Matriz Antisimetrica: "+Arrays.deepEquals(matrice1, matrizas2));        
        }  */      
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
  /* if (matriz[i][j] == matriz[j][i]*(-1)){
       resultadO=true;
 // System.out.println("Es una Matriz Antisimetrica"); 
  
       } else{
 // System.out.println("No es una Matriz Antisimetrica");
      resultadO = false;
    }
   
            }
            }
                if (resultadO==true) {
                    System.out.println("Es una Matriz Antisimetrica"+resultadO); 
                }else{
             
                    System.out.println("No es una Matriz Antisimetrica");
                
// matriz[j][i]=  matrizas2[j][i]*(-1);
              
          
            }*/
            
     
      
      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    /*  for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {  
                if (matriz[i][j]<0) {
                    
                   
                if (matriz[0][0] == matriz[2][2] ) {
                   // System.out.println("1");
                    if (matriz[0][1] != matriz[1][0]) {
                       // System.out.println("2");
                        if (matriz[0][2] != matriz[2][0]) {
                          //  System.out.println("3");
                            if (matriz[2][1] != matriz[1][2]) {
                                
                                System.out.println(" La matriz dada es anti simétrica. ");
                                break;
                                
                            }
 
                        }
      
                        
                    }
                
                        
                        
                        
                    
                    
                    
                }
                }
                }
            
            }*/
            
        
     
        
  
    
    

        
        
    }
}