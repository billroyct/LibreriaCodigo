
package Prototype;

public abstract class Heroe implements Cloneable {
    
    private String nombre ="";
    private String arma = "";
    // ------------------------------
    public String getNombre() {
        return this.nombre;
    }
    // ------------------------------
    public void setNombre( String nombre) {
        this.nombre = nombre;
    }
    // ------------------------------
    public String getArma() {
        return this.arma;
    }
    // ------------------------------
    public void setArma( String arma) {
        this.arma = arma;
    }
    // ------------------------------
     public Heroe clonar() throws CloneNotSupportedException {

         return (Heroe) this.clone();
    }
    // ------------------------------

    public abstract void atacar();
    public abstract void detener();
}
