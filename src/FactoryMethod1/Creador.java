
package FactoryMethod1;

import FactoryMethod2.IMusica;
import FactoryMethod2.MusicaA;
import FactoryMethod2.MusicaB;

public class Creador extends CreadorAbstracto {
   
    public void Creador() {
    }

    @Override
     public IMusica crear(int tipo)
    {
        IMusica objeto;
        switch( tipo )
        {
            case A:
                objeto = new MusicaA();
                break;
            case B:
                objeto = new MusicaB();
                break;
            default:
                objeto = null;
        }
        return objeto;
    } 
}
