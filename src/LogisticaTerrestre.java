public class LogisticaTerrestre extends Logistica {
    @Override
    public Transporte crearTransporte() {
        return new Auto();
    }
}

