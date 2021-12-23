
package Prototype;

public class Agilidad extends Heroe {
    
    public Agilidad() {
        System.out.println("Heroe de Agilidad creado");
    }

    @Override
    public void atacar() {
        System.out.println("El heroe ataca");
    }
    // ------------------------------
    @Override
    public void detener() {
        System.out.println("El heroe se detiene");
    }
}
