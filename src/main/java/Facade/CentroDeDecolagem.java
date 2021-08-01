package Facade;

public class CentroDeDecolagem extends CentroDeControle {

    private static CentroDeDecolagem centroDeDecolagem = new CentroDeDecolagem();

    private CentroDeDecolagem() {};
    public static CentroDeDecolagem getInstancia() {
        return centroDeDecolagem;
    }

}
