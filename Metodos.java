/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion3rclases;

/**
 *
 * @author usuario
 */
class Metodos {

    public static int generarNumeroAleatorio (int minimo , int maximo ){

        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));

    return num;  

}
    
}
