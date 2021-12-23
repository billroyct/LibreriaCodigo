
package Prototype;

public class Fuerza extends Heroe {
    
    public Fuerza() {
        System.out.println("Heroe de Fuerza creado");
    }
    // ------------------------------
    @Override
    public void atacar() {
        System.out.println("El Heroe ataca");
    }
    // ------------------------------
    @Override
    public void detener() {
        System.out.println("El heroe se detiene");
    }
}
