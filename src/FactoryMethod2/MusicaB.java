
package FactoryMethod2;


public class MusicaB implements IMusica {
    public MusicaB() {
    }

    @Override
     public void reproducir() {
        System.out.println("Reproduciendo la musica B");
    }
}

