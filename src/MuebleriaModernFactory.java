import Silla.ISilla;
import Silla.SillaModerna;
import Mesilla.IMesilla;
import Mesilla.MesillaModerna;


public class MuebleriaModernFactory extends MuebleriaAbstractFactory {
    @Override
    public ISilla crearSilla() {
        ISilla silla = new SillaModerna();
        return silla;
    }

    @Override
    public IMesilla crearMesilla() {
        IMesilla mesilla = new MesillaModerna();
        return mesilla;
    }
}
