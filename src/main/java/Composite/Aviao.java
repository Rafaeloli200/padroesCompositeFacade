package Composite;

public class Aviao {

    private Ala classe;

    public void setClasse(Ala classe) {
        this.classe = classe;
    }

    public String getClasse() {
        if (this.classe == null) {
            throw new NullPointerException("Aviao sem classe");
        }
        return this.classe.getAla();
    }
}
