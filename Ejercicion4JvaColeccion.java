/*
4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:
19
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:


• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package ejercicion4jvacoleccion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicion4JvaColeccion {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Pelicula> Peliculas = new ArrayList();
      
        String pelicula;
        String opciones;
        String direc;
        
        Integer tiempo = 0;
        
        
        
        do {            
             Pelicula peli = new Pelicula();
            System.out.println("Ingrese el Nombre de la pelicula: ");
           
           
            pelicula = entrada.next();
            
            
            
            System.out.println("Ingrese el nombre del director: ");
            direc = entrada.next();
            
            System.out.println("Ingrese el tiempo de duracion: ");
            tiempo = entrada.nextInt();
            
            peli.setTitulo(pelicula);
           
           peli.setDirector(direc);
          
          peli.setDuracion(tiempo);
            
            
            Peliculas.add(peli);
            
            System.out.println("Quiere agregar otro alumno? s/n ");
            opciones = entrada.next();
            
            
        }while (opciones.equalsIgnoreCase("s"));          
            
        
        
        System.out.println("   ");
        System.out.println("Todas las peliculas: ");
        for (Pelicula aux : Peliculas) {
            aux.mostrarPelicula(Peliculas);
            break;
        }
        System.out.println("  ");
        System.out.println("----------------------------------------------------");
        System.out.println("   ");
        System.out.println("Todas las peliculas con  duracion mayor a 1 hora: ");
            
         for (Pelicula Pelicula1 : Peliculas) {
            Pelicula1.Mayora1(Peliculas);
            break;
        }
         System.out.println(" ");
            System.out.println("----------------------------------------------------");
            System.out.println("    ");
            System.out.println("Peliculas de Mayor a menor duracion: ");
            
           Collections.sort(Peliculas, Pelicula.mayorMenComparator);
            for (Pelicula aux : Peliculas) {
                System.out.println(aux);
            
        }
            System.out.println("  ");
        System.out.println("----------------------------------------------------");
        
             System.out.println("Peliculas de Menor a mayor duracion: ");
            
           Collections.sort(Peliculas, Pelicula.MenormayoComparator);
            for (Pelicula aux : Peliculas) {
                System.out.println(aux);
            
        }
            System.out.println("  ");
        System.out.println("----------------------------------------------------");
          System.out.println("Peliculas ordenadas por titulos alfabeticamente: ");
            
           Collections.sort(Peliculas, Pelicula.tituloOrdenado);
            for (Pelicula aux : Peliculas) {
                System.out.println(aux);
            
        }
            System.out.println("  ");
            System.out.println("----------------------------------------------------");
              System.out.println("Peliculas ordenadas por directores alfabeticamente: ");
            
           Collections.sort(Peliculas, Pelicula.directorOrdenado);
            for (Pelicula aux : Peliculas) {
                System.out.println(aux);
            
        }
        
        
    }
}
