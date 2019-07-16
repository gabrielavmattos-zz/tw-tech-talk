package abc;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class ReajusteSalarialTest {

    @Test
    public void reajuste_deveRetornarSalarioAjustadoComQuatroPorcento_quandoForAcimaDeDoisMilReais() {

        ReajusteSalarial reajusteSalarial = new ReajusteSalarial(2000.0);

        Double salarioAjustado = reajusteSalarial.reajuste();
        assertThat(salarioAjustado, is(2080.0));
    }

    @Test
    public void reajuste_deveRetornarSalarioSemReajuste_quandoForAbaixoDeDoisMilReais() {

        ReajusteSalarial reajusteSalarial = new ReajusteSalarial(1000.0);

        Double salarioAjustado = reajusteSalarial.reajuste();
        assertThat(salarioAjustado, is(1000.0));
    }

}
