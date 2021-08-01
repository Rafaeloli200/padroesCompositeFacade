package Facade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AviaoTest {

    @Test
    void retornaPendenciaCentroDePouso() {
        Aviao aviao = new Aviao();
        CentroDePouso.getInstancia().addAviaoComPendencia(aviao);

        assertEquals(false, aviao.decolar());
    }

    @Test
    void retornaPendenciaCentroDeDecolagem() {
        Aviao aviao = new Aviao();
        CentroDeDecolagem.getInstancia().addAviaoComPendencia(aviao);

        assertEquals(false, aviao.decolar());
    }

    @Test
    void retornaAviaoSemPendencia() {
        Aviao aviao = new Aviao();

        assertEquals(true, aviao.decolar());
    }

}
