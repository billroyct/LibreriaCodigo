import Silla.ISilla;
import Mesilla.IMesilla;


public abstract class MuebleriaAbstractFactory {
    public abstract ISilla crearSilla();
    public abstract IMesilla crearMesilla();
}