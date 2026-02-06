// ======================================================================================================================================================================
// EX 6 - Classe ContaBancaria: Implemente uma classe com saldo e métodos para depositar e sacar dinheiro.
// ======================================================================================================================================================================

public class ContaBancaria {

    //declarando atributos
    private double saldo;
    private double deposito;
    private double saque;

    //construtor
    public ContaBancaria(double saldoInicial) {

        this.saldo = saldoInicial;

    }

    //métodos
    public void depositar(double valor) {

        this.deposito = valor; //esse valor é passado na classe principal

        if(valor > 0) {

            saldo+= valor;

            System.out.println("Seu dposíto foi realizado. Saldo: R$" + saldo);

        } else {

            System.out.println("[ERRO] Informe um valor válido.");

        }
       
    }

    public void sacar(double valor) {

        this.saque = valor; //esse valor é passado na classe principal

        if(valor > 0 && valor <= saldo) {

            saldo-= valor;

            System.out.println("Seu saque foi realizado com sucesso! Saldo: R$" + saldo);

        } else if(valor > saldo) {

            System.out.println("Saldo insuficiente!");

        } else {

            System.out.println("[ERRO] Informe um valor válido.");

        }

    }

    public void mostrarSaldo() {

        System.out.println("Saldo atual: R$" + saldo);

    }

}
