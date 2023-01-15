

import java.util.Scanner;

/*
26. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.



*/ 
 
 


/**
 *
 * @author 
 */
public class EjercicioN26Ulp {
    public static void main(String[] args) {
        





   
   
     
        Scanner entrada = new Scanner(System.in);
        int matrizM[][] = new int[10][10];
        int matrizP[][] = new int[3][3];
        int dim_matriz = 10;
        int Rmatriz_2 = 3;
        
        int[] myArray0 = {1,26,36,47,5,6,72,81,95,10};
        int[] myArray1 = {11,12,13,21,41,22,67,20,10,61};
        int[] myArray2 = {56, 78, 87, 90, 9, 90, 17, 12,87,67};
        int[] myArray3 = {41, 87, 24, 56, 97, 74, 87, 42,64,35};
        int[] myArray4 = {32, 76, 79, 1, 36, 5, 67, 96,12,11};
        int[] myArray5 = {99, 13, 54, 88, 89, 90, 75, 12,41,76};
        int[] myArray6 = {67, 78, 87, 45, 14, 22, 26, 42,56,78};
        int[] myArray7 = {98, 45, 34, 23, 32, 56, 74, 16,19,18};
        int[] myArray8 = {24, 67, 97, 46, 87, 13, 67, 89,93,24};
        int[] myArray9 = {21, 68, 78, 98, 90, 67, 12, 41,65,12};
         int[] myArray10 = {36,5,67};
         int[] myArray11 = {89,90,75};
         int[] myArray12 = {14,22,26};
        
        for (int i = 0; i < 10; i++) {
            matrizM[0][i] = myArray0[i];
            matrizM[1][i] = myArray1[i];
            matrizM[2][i] = myArray2[i];
            matrizM[3][i] = myArray3[i];
            matrizM[4][i] = myArray4[i];
            matrizM[5][i] = myArray5[i];
            matrizM[6][i] = myArray6[i];
            matrizM[7][i] = myArray7[i];
            matrizM[8][i] = myArray8[i];
            matrizM[9][i] = myArray9[i];
        }

         for (int i = 0; i < 3; i++) {
            matrizP[0][i] = myArray10[i];
            matrizP[1][i] = myArray11[i];
            matrizP[2][i] = myArray12[i];

        }
    
              System.out.println("/////////Matriz M: ");
      for (int i = 0; i < dim_matriz; i++) {
            for (int j = 0; j < dim_matriz; j++) {
                System.out.print(" " + matrizM[i][j] + " ");
            }
            System.out.println("");
        }
              System.out.println("/////////////////SUBMatriz a buscar:    ");
            for (int i = 0; i < Rmatriz_2; i++) {
            for (int j = 0; j < Rmatriz_2; j++) {
                System.out.print(" " + matrizP[i][j] + " ");
            }
            System.out.println("");
        
                System.out.println("");
            } 
       
            
            
               if (matrizM[4][4]==matrizP[0][0] && matrizM[4][5]==matrizP[0][1] && matrizM[4][6]==matrizP[0][2] ) {     /////Para identificar la submatriz P.
                      
                    if (matrizM[5][4]==matrizP[1][0] && matrizM[5][5]==matrizP[1][1] && matrizM[5][6]==matrizP[1][2]) {
                        if (matrizM[6][4]==matrizP[2][0] && matrizM[6][5]==matrizP[2][1] && matrizM[6][6]==matrizP[2][2]) {
                            System.out.println(" Coicide con la Matri P. ");
                        }
                   }
                    
          }
            
        System.out.println(" /////////////////////////////////// ");
            
       System.out.println("El elemento a buscar:_________");



         
//busqueda de forma contabilizada:
  
       for (int i = 0; i < 7; i++) {
        for (int j = 0; j < 7; j++) {
        
            
           
            if(matrizP[0][0]==matrizM[i][j]){
       
        System.out.println("["+i+"]"+"["+j+"]");

    }   if (i==4 && j==4 && matrizP[0][0]==matrizM[i][j] ) {
   System.out.println("La matriz ["+i+"]["+j+"] coicide con el primer elemento de la  submatriz P. ");
   
    }
           
    }
 }
        
       
       //}if (matriz[4][4]==matriz[i][j] ) {
         //    System.out.println("["+4+"]"+"["+4+"]");
        //}
        
        //System.out.println("["+filas+"]"+"["+columnas+"]");
      //if (a[i][j]==b[0][0])

     //System.out.println("El valor "+primerElmento+" esta en la siguiente coordenada: ["+filas+"]"+"["+columnas+"]");
     
        
            
   
  /*for(int filas=0;filas<matriz.length;filas++){
   for(int columnas=0;columnas<matriz.length;columnas++){
    if(matriz[filas][columnas]==nbuscado2 ){
  //   coordenadas+="["+filas+","+columnas+"]"+"\n";
  System.out.println("["+filas+"]"+"["+columnas+"]");
        if (filas == myArray10.length ) {
     System.out.println("El valor "+nbuscado+" esta en la siguiente coordenada: ["+filas+"]"+"["+columnas+"]");
     break;
        }
            }
    }
   }*/
  
  
      
}   
}   

    
    
    


       
    
