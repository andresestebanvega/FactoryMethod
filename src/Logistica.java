public abstract class Logistica {
    // Factory Method
    public abstract Transporte crearTransporte();

    // Lógica común para organizar el transporte
    public void planearViaje() {
        Transporte transporte = crearTransporte();
        transporte.iniciarViaje();
    }
}
