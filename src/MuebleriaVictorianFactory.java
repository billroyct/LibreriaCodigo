import Silla.ISilla;
import Silla.SillaVictoriana;
import Mesilla.IMesilla;
import Mesilla.MesillaVictoriana;


public class MuebleriaVictorianFactory extends MuebleriaAbstractFactory {
    @Override
    public ISilla crearSilla() {
        ISilla silla = new SillaVictoriana();
        return silla;
    }

    @Override
    public IMesilla crearMesilla() {
        IMesilla mesilla = new MesillaVictoriana();
        return mesilla;
    }
}