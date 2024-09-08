public class LogisticaAerea extends Logistica {
    @Override
    public Transporte crearTransporte() {
        return new Avion();
    }
}


