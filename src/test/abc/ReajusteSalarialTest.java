package abc;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class ReajusteSalarialTest {

    @Test
    public void reajuste_deveRetornarSalarioAjustadoComQuatroPorcento_quandoForAcimaOuIgualDoisMilReais() {

        ReajusteSalarial salario = new ReajusteSalarial(2000.0);

        Double salarioAjustado = salario.reajuste();
        assertThat(2080.0, is(salarioAjustado));
    }

    @Test
    public void reajuste_deveRetornarSalarioSemReajuste_quandoForAbaixoDeDoisMilReaisEAcimaDeMilReais() {

        ReajusteSalarial salario = new ReajusteSalarial(1000.0);

        Double salarioAjustado = salario.reajuste();
        assertThat(1000.0, is(salarioAjustado));
    }

    @Test
    public void reajuste_deveRetornarSalarioAjustadoComVintePorcento_quandoForAbaixoDeMilReais() {

        ReajusteSalarial salario = new ReajusteSalarial(999.0);

        Double salarioAjustado = salario.reajuste();
        assertThat(1198.8, is(salarioAjustado));
    }

}
