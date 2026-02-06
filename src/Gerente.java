// ======================================================================================================================================================================
// EX 9 - Classe Funcionario e Gerente: Crie uma classe Funcionario com nome e salario. Crie uma subclasse Gerente que tem um bônus adicional.
// ======================================================================================================================================================================

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
