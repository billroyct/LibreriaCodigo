
package FactoryMethod1;

import FactoryMethod2.IMusica;
/**
 *
 * @author BILL ROY
 */
public class main {
    public static void main(String[] args)
    {
        CreadorAbstracto creator = new Creador();
        IMusica A = creator.crear( Creador.A );
        A.reproducir();
        IMusica B = creator.crear( Creador.B );
        B.reproducir();
    }
}
