package Facade;

public class AviaoFacade {

    public static boolean verificarPendenciasDecolagem(Aviao aviao) {
        if (CentroDeDecolagem.getInstancia().verificarAviaoComPendencia(aviao)) {
            return false;
        }

        if (CentroDePouso.getInstancia().verificarAviaoComPendencia(aviao)) {
            return false;
        }
        return true;
    }
}
