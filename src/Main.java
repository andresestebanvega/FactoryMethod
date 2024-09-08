//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Planear viaje por tierra
        Logistica logisticaTerrestre = new LogisticaTerrestre();
        logisticaTerrestre.planearViaje();

        // Planear viaje por mar
        Logistica logisticaMaritima = new LogisticaMaritima();
        logisticaMaritima.planearViaje();

        // Planear viaje por aire
        Logistica logisticaAerea = new LogisticaAerea();
        logisticaAerea.planearViaje();
    }
}