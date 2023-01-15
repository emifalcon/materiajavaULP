/*

 */
package ejercicion4jvacoleccion;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author usuario
 */
public class Pelicula {
    
    private String titulo;
    
     private String director;
    
     private Integer duracion;

    public Pelicula() {
        
        
    }

    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return 
                "Titulo: " + titulo + 
                " director: " + director + 
                " duracion: " + duracion+"h";
    }

  
    public void mostrarPelicula( ArrayList<Pelicula> listado){
        
        System.out.println("Todas las peliculas en el listado: ");
        for (Pelicula aux : listado) {
            System.out.println(" "+aux);
        }
        
        
    }
    
    public void  Mayora1 ( ArrayList<Pelicula> listado){
    
       

        for (Pelicula mayord : listado) {
            
            if (mayord.getDuracion()>1) {
                
                System.out.println( mayord);
                
            }
            
        }
         
     
}  
public static  Comparator<Pelicula> mayorMenComparator = new Comparator<Pelicula>() {
    @Override
    public int compare (Pelicula p1 , Pelicula p2){
    
    return  p2.duracion.compareTo(p1.duracion);
    
}
    };
        
   public static  Comparator<Pelicula> MenormayoComparator = new Comparator<Pelicula>() {
    @Override
    public int compare (Pelicula t1 , Pelicula t2){
    
    return  t1.duracion.compareTo(t2.duracion);
    
}
    };
    
    public static  Comparator<Pelicula> tituloOrdenado = new Comparator<Pelicula>() {
    @Override
    public int compare (Pelicula p1 , Pelicula p2){
    
    return  p1.titulo.compareTo(p2.titulo);
    
}
    };
    
    
    public static  Comparator<Pelicula> directorOrdenado = new Comparator<Pelicula>() {
    @Override
    public int compare (Pelicula d1 , Pelicula d2){
    
    return  d1.director.compareTo(d2.director);
    
}
    };
    
    
    
    
    
}
