package Facade;

import java.text.Normalizer;

public class Aviao {

    public boolean decolar() {
        return AviaoFacade.verificarPendenciasDecolagem(this);
    }
}
