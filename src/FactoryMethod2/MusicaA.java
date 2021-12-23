
package FactoryMethod2;

public class MusicaA implements IMusica {
    public MusicaA() {
    }

    @Override
     public void reproducir() {
        System.out.println("Reproduciendo la musica A");
    }
}
