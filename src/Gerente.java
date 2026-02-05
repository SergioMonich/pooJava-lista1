//exercio 9

public class Gerente extends Funcionario {

    private double bonus;

    public Gerente(String nome, double salario) {

        super(nome, salario);
        this.bonus = bonus;

    }

    public void aplicarBonus() {

        double salarioAtual = getSalario();
        double bonus = salarioAtual * 0.1;
        setSalario(salarioAtual + bonus);

    }

}
