package Facade;

import java.util.ArrayList;
import java.util.List;

public abstract class CentroDeControle {

    private List<Aviao> avioesComPendencia = new ArrayList<Aviao>();

    public void addAviaoComPendencia(Aviao aviao) {
        this.avioesComPendencia.add(aviao);
    }

    public boolean verificarAviaoComPendencia(Aviao aviao) {
        return avioesComPendencia.contains(aviao);
    }

}

