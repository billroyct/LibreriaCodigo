
package Mesilla;

public class MesillaModerna implements IMesilla {
    @Override
    public String Tipo() {
        return "Moderna";
    }
    @Override
    public String Color() {
        return "Blanco";
    }
    @Override
    public String toString() {
        return "Tipo: " + Tipo() + (" -- Color: ") + (Color());
    }
}
