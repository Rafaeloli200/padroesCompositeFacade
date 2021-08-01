
package Composite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AviaoTest {

    @Test
    void retornaClasseAviao() {
        Fila fila1 = new Fila("Janela");

        Fila fila2 = new Fila("Centro");
        Assento assento21 = new Assento("21", 2);
        fila2.addAla(assento21);

        Fila fila3 = new Fila("Corredor");
        Assento assento31 = new Assento("31", 3);
        Assento assento32 = new Assento("32", 4);
        fila3.addAla(assento31);
        fila3.addAla(assento32);

        Fila classe = new Fila("A");
        classe.addAla(fila1);
        classe.addAla(fila2);
        classe.addAla(fila3);

        Aviao aviao = new Aviao();
        aviao.setClasse(classe);

        assertEquals("Classe: A\n" +
                "Fila: Janela\n" +
                "Fila: Centro\n" +
                "Assento: 21 - numero: 2\n" +
                "Fila: Corredor\n" +
                "Assento: 31 - numero: 3\n" +
                "Assento: 32 - numero: 4\n", aviao.getClasse());
    }

    @Test
    void retornaExecacaoAviaoSemClasse() {
        try {
            Aviao aviao = new Aviao();
            aviao.getClasse();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Aviao sem classe", e.getMessage());
        }
    }
}