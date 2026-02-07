// ======================================================================================================================================================================
// EX 10 - Classe Veiculo e Moto: Crie uma classe Veiculo e uma subclasse Moto. Adicione um atributo cilindrada e um método para exibi-lo. 
// ======================================================================================================================================================================

// ======================================================================================================================================================================
// EX 19 - Hierarquia de Veículos: Crie uma hierarquia de classes Veiculo -> Carro -> CarroEletrico, e sobrescreva um método abastecer() para se adaptar a cada tipo de veículo. 
// ======================================================================================================================================================================

public class Veiculo {

    private int cilindradas;

    public Veiculo(int cilindradas) {

        this.cilindradas = cilindradas;

    }

    public void exibirInformacoes(){
        
        System.out.println("Cilindradas: " + cilindradas);

    }

    public void abastecer() {
        
        System.out.println("Abastecendo...");

    }

}
