
package Silla;

public class SillaModerna implements ISilla {
    @Override
    public String Estilo() {
        return "Moderna";
    }

    @Override
    public int nPatas() {
        return 4;
    }

    @Override
    public String Color() {
        return "Marrón";
    }
    
    @Override
    public String toString(){
        return "Estilo: " + Estilo() + (" -- Patas: ") + nPatas() + (" -- Color: ") + Color();
    }
    
}
