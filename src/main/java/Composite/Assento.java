package Composite;

public class Assento extends Ala {

    private int numero;

    public Assento(String descricao, int numero) {
        super(descricao);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String getAla() {
        return "Classe: " + this.getDescricao() + " - numero: " + this.numero + "\n";
    }

}
