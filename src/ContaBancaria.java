//exercicio 6

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

        this.deposito = valor;

        if(valor > 0) {

            saldo+= valor;

            System.out.println("Seu dposíto foi realizado. Saldo: R$" + saldo);

        } else {

            System.out.println("[ERRO] Informe um valor válido.");

        }
       
    }

    public void sacar(double valor) {

        this.saque = valor;

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

    //getters
    public double getDeposito() {
        
        return deposito;
    }

    public double getSaque() {

        return saque;

    }

    //setter
    public void setDeposito(double valor) {

        this.deposito = deposito;

    }

    public void setSaque(double valor) {

        this.saque = saque;

    }

}
