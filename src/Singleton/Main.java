package Singleton;


public class Main {
    public static void main(String[] args)
    {
        for(int num=1; num<=4; num++)
        {
            Automovil.getInstancia();
        }
    }
}
