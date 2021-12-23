package Builder;

public class Director
{
    public Director() {
    }
    // --------------------------
     public void construir( BuilderCoche builder )
    {
        builder.crearNuevoCoche();
        builder.construirMotor();
        builder.construirCarroceria();
        builder.construirElevalunas();
        builder.construirAireAcond();
    }
}
