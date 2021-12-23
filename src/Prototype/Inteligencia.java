
package Prototype;

public class Inteligencia extends Heroe {
    
    public Inteligencia() {
        System.out.println("Heroe de Inteligencia creado");
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
