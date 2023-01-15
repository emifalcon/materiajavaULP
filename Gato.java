/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicion1herencia;

/**
 *
 * @author usuario
 */
public class Gato extends Animal{
  public  Gato(String nombre, String alimento, int edad, String raza){
        
        super(nombre, alimento, edad, raza);
       // this.sealimenta = sealimenta;
        
    }
    public  void Alimentarse(){
     
        System.out.println("El gato llamado "+nombre+" se alimenta de: "+alimento);
      
      
    }
    
     
}
