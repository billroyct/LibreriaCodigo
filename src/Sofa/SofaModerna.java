
package Sofa;

public class SofaModerna implements ISofa {
    @Override
    public String Estilo() {
        return "Moderna";
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
        return "Estilo: [ " + Estilo() + (" -- Material: ") + Material() + (" -- Color: ") + Color();
    }
}
