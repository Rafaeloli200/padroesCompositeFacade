package Facade;

public class CentroDePouso extends CentroDeControle {

    private static CentroDePouso centroDePouso = new CentroDePouso();

    private CentroDePouso() {};
    public static CentroDePouso getInstancia() {
        return centroDePouso;
    }
}
