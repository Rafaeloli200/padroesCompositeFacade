package Composite;

import java.util.ArrayList;
import java.util.List;

public class Fila extends Ala {

    private List<Ala> alas;

    public Fila(String descricao) {
        super(descricao);
        this.alas = new ArrayList<Ala>();
    }

    public void addAla(Ala ala) {
        this.alas.add(ala);
    }

    @Override
    public String getAla() {
        String saida = "";
        saida = "Fila: " + this.getDescricao() + "\n";
        for (Ala ala : alas) {
            saida += ala.getAla();
        }
        return saida;
    }
}
