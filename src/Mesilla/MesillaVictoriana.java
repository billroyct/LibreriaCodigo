
package Mesilla;

public class MesillaVictoriana implements IMesilla {
    @Override
    public String Tipo() {
        return "Victoriana";
    }

    @Override
    public String Color() {
        return "Azul";
    }
    @Override
    public String toString() {
        return "Tipo: " + Tipo() + (" -- Color: ") + (Color());
    }
}
