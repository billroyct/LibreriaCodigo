
package Silla;

public class SillaVictoriana implements ISilla {
    @Override
    public String Estilo() {
        return "Victoriana";
    }

    @Override
    public int nPatas() {
        return 4;
    }

    @Override
    public String Color() {
        return "Rojo";
    }
    
    @Override
    public String toString(){
        return "Estilo: " + Estilo() + (" -- Patas: ") + nPatas() + (" -- Color: ") + Color();
    }
}
