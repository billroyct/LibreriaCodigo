import Silla.ISilla;
import Mesilla.IMesilla;


public class Cliente {
    
    public static void main (String [] args) {
        // ejemplo de fábrica moderna
        MuebleriaAbstractFactory ModernFactory = new MuebleriaModernFactory();
        // instancia de silla de la fábrica moderna
        ISilla SillaModerna =  ModernFactory.crearSilla();
        // instancia de mesilla de la fábrica moderna
        IMesilla MesillaModerna =  ModernFactory.crearMesilla();
        System.out.println(MesillaModerna.toString());

        //ejemplo de la fábrica victoriana
        MuebleriaAbstractFactory VictorianFactory = new MuebleriaVictorianFactory();
        // instancia de silla de la fábrica victoriana
        ISilla SillaVictoriana = VictorianFactory.crearSilla();
        // instancia de mesilla de la fábrica moderna
        IMesilla MesillaVictoriana = VictorianFactory.crearMesilla();
        System.out.println(SillaVictoriana.toString());
    }
}