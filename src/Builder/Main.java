
package Builder;

public class Main
{
    public static void main(String[] args)
    {
       
         Director objFabrica = new Director();
        
         BuilderCoche base  = new ConstructorCocheBase();
         BuilderCoche medio = new ConstructorCocheMedio();
         BuilderCoche full  = new ConstructorCocheFull();
       
         objFabrica.construir( base );
         Coche cocheBase = base.getCoche();
        
        objFabrica.construir( medio );
        Coche cocheMedio = medio.getCoche();
        
        objFabrica.construir( full );
        Coche cocheFull = full.getCoche();
        
        mostrarCaracteristicas( cocheBase );
        mostrarCaracteristicas( cocheMedio );
        mostrarCaracteristicas( cocheFull );
    }

    public static void mostrarCaracteristicas( Coche coche )
    {
        System.out.println( "Motor: " + coche.getMotor() );
        System.out.println( "Carrocería: " + coche.getCarroceria() );
        System.out.println( "Elevalunas eléctrico: " + coche.getElevalunasElec() );
        System.out.println( "Airea acondicionado: " + coche.getAireAcond() );
        
    }
}
