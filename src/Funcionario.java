// ======================================================================================================================================================================
// EX 9 - Classe Funcionario e Gerente: Crie uma classe Funcionario com nome e salario. Crie uma subclasse Gerente que tem um bônus adicional.
// ======================================================================================================================================================================

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
    
        this.nome = nome;
        this.salario = salario;
        
    }

    public void mostrarSalario() {

        System.out.println(nome + " Salario R$" + salario);

    }

    public String getNome() {

        return nome;

    }

    public double getSalario() {

        return salario;

    }

    public void setSalario(double salario) {

        this.salario = salario;

    }

}
