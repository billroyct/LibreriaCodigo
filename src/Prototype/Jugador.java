
package Prototype;

import java.util.Hashtable;

public class Jugador {
    // Para almacenar los objetos de tipo Prototype que se vayan creando
     private Hashtable hHeroe = new Hashtable();
    // ------------------------------
    public Jugador()
    {
        // Crear un Heroe de Agilidad
        Heroe a1 = new Agilidad();
        a1.setNombre("Bounty Hunter");
        a1.setArma("Espada");
        
         this.addHeroe( a1.getNombre(), a1 );
        
        // Crear un Heroe de Fuerza
        Heroe f1 = new Fuerza();
        f1.setNombre("Axe");
        f1.setArma("Hacha");

        this.addHeroe( f1.getNombre(), f1 );
        
        // Crear un Heroe de Inteligencia
        Heroe i1 = new Inteligencia();
        i1.setNombre("Windranger");
        i1.setArma("Arco");

        this.addHeroe( i1.getNombre(), i1 );
    }

    public void addHeroe( String nombre, Heroe objHeroe )
    {
        this.hHeroe.put( nombre, objHeroe );
    }

    public Heroe getHeroe( String nombre )
    {
        Heroe objPrototipo = (Agilidad) hHeroe.get( nombre );
        return objPrototipo;
    }
    // ------------------------------
     public Heroe getClon( String nombre )
    {

         Heroe objPrototipo = (Agilidad) hHeroe.get( nombre );
 
         try {
             // Devolver un clon
             return (Heroe) objPrototipo.clonar();
         } catch( CloneNotSupportedException e ) {
 
             System.out.println("Error al crear Heroe, salimos del programa.");
             System.exit(0);
         }
        return null;
    }
}
