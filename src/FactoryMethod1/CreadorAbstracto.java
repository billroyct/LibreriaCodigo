
package FactoryMethod1;

import FactoryMethod2.IMusica;

public abstract class CreadorAbstracto {
    
    public static final int A = 1;
    public static final int B = 2;

     public abstract IMusica crear(int tipo);  
}
