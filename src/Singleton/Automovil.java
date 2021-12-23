package Singleton;

public class Automovil {
     private static Automovil instancia;
    // ----------------------------------------
    private Automovil() {
    }
    // ----------------------------------------
     public static Automovil getInstancia()
    {
         if (instancia == null) {
             instancia = new Automovil();
            System.out.println("El objeto ha sido creado");
        }
        else {
            System.out.println("Ya existe el objeto");
        }
         return instancia;
    }
}
