
package Sofa;

public class SofaVictoriana implements ISofa{
    @Override
    public String Estilo() {
        return "Victoriana";
    }

    @Override
    public String Material() {
        return "Cuero";
    }

    @Override
    public String Color() {
        return "Marrón";
    } 
    @Override
    public String toString(){
        return "Estilo: " + Estilo() + (" -- Material: ") + Material() + (" -- Color: ") + Color();
    }
}
