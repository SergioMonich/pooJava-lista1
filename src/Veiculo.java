// ======================================================================================================================================================================
// EX 10 - Classe Veiculo e Moto: Crie uma classe Veiculo e uma subclasse Moto. Adicione um atributo cilindrada e um método para exibi-lo. 
// ======================================================================================================================================================================

public class Veiculo {

    private int cilindradas;

    public Veiculo(int cilindradas) {

        this.cilindradas = cilindradas;

    }

    public void exibirInformacoes(){
        
        System.out.println("Cilindradas: " + cilindradas);

    }

}
