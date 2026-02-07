// ======================================================================================================================================================================
// EX 10 - Classe Veiculo e Moto: Crie uma classe Veiculo e uma subclasse Moto. Adicione um atributo cilindrada e um método para exibi-lo. 
// ======================================================================================================================================================================

// ======================================================================================================================================================================
// EX 19 - Hierarquia de Veículos: Crie uma hierarquia de classes Veiculo -> Carro -> CarroEletrico, e sobrescreva um método abastecer() para se adaptar a cada tipo de veículo. 
// ======================================================================================================================================================================

public class Moto extends Veiculo {
    
    //declarando atributos
    private String marca;
    private String modelo;
    
    //construtor
    public Moto(int cilindradas, String marca, String modelo) {

        super(cilindradas);
        this.marca = marca;
        this.modelo = modelo;
           
    }

    //método com subscrição
    @Override
    public void exibirInformacoes() {

        super.exibirInformacoes();//herdando o método da classe pai
        System.out.println("Marca: " + marca);//implementando método específico
        System.out.println("Modelo: " + modelo);

    }

    @Override
    public void abastecer() {
        
        System.out.println("Abastecendo com gasolina");
    
    }

    


}