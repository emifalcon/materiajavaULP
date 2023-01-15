/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Ejercicion3Coleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> listadoA = new ArrayList(); 
        Alumno alumno;
        ArrayList<Integer> notas;
        String opcion;
        boolean encontrado = false;
        
        do {

            alumno = new Alumno();
            notas = new ArrayList<>(); 

            System.out.println("Ingrese el nombre del estudiante");
            String nombre = scan.next();

            System.out.println("Ingrese la nota 1");
            Integer nota1 = scan.nextInt();

            System.out.println("Ingrese la nota 2");
            Integer nota2 = scan.nextInt();

            System.out.println("Ingrese la nota 3");
            Integer nota3 = scan.nextInt();
            
            notas.add(nota1);
            notas.add(nota2);
            notas.add(nota3);

            alumno.setNombre(nombre);
            alumno.setNotas(notas);

            listadoA.add(alumno);

            System.out.println("Quiere ingresar otro alumno? S/N");
            opcion = scan.next();
            
        } while (opcion.equalsIgnoreCase("S"));

        
            System.out.println(listadoA);
        
        
        System.out.println("Escriba nombre del Alumno para nota final:");
        String estudiante = scan.next();
        
       

            if (alumno.getNombre().equalsIgnoreCase(estudiante)) {
                System.out.println("Nota final:  " + alumno.notaFinal());
                encontrado = true;
            }
        
        if (!encontrado) {
            System.out.println("El alumno no se encuentra  ");
        }
    }
}
