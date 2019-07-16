package abc;

public class ReajusteSalarial {
    private double salario;

    public ReajusteSalarial(double salario) {
        this.salario = salario;
    }

    public Double reajuste() {
        double ajuste = 0;

        if (salario >= 2000) {
            ajuste = 0.04;
        }
        return salario + salario * ajuste;
    }
}
