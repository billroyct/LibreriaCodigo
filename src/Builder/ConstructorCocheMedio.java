package Builder;

public class ConstructorCocheMedio extends BuilderCoche
{
    public ConstructorCocheMedio() {
    }
    // ------------------------------
    @Override
     public void construirMotor() {
        this.coche.setMotor( "Motor de potencia media" );
    }
    // ------------------------------
    @Override
     public void construirCarroceria() {
        this.coche.setCarroceria( "Carrocería de protección media" );
    }
    // ------------------------------
    @Override
     public void construirAireAcond() {
        this.coche.setAireAcond( false);
    }
    // ------------------------------
    @Override
     public void construirElevalunas() {
        this.coche.setElevalunasElec( true );
    }
}