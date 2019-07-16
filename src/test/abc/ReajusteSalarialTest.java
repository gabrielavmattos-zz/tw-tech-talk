package abc;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class ReajusteSalarialTest {

    @Test
    public void reajuste_deveRetornarSalarioAjustadoComQuatroPorcento_quandoForAcimaDeDoisMilReais() {

        ReajusteSalarial salario = new ReajusteSalarial(2000.0);

        Double salarioAjustado = salario.reajuste();
        assertThat(2080.0, is(salarioAjustado));
    }

    @Test
    public void reajuste_deveRetornarSalarioSemReajuste_quandoForAbaixoDeDoisMilReais() {

        ReajusteSalarial salario = new ReajusteSalarial(1000.0);

        Double salarioAjustado = salario.reajuste();
        assertThat(1000.0, is(salarioAjustado));
    }

}
