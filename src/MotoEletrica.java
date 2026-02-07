// ======================================================================================================================================================================
// EX 19 - Hierarquia de Veículos: Crie uma hierarquia de classes Veiculo -> Carro -> CarroEletrico, e sobrescreva um método abastecer() para se adaptar a cada tipo de veículo. 
// ======================================================================================================================================================================

public class MotoEletrica extends Moto {

    //declarando os atributos
    private int potencia;

    //construtor herdando atributos das classes anteriores (Veiculo -> Moto) e inplementndo atributos específicos
    public MotoEletrica(int cilindradas, String marca, String modelo, int potencia) {
        
        super(cilindradas, marca, modelo);
        this.potencia = potencia;
    
    }

    @Override
    public void abastecer() {
        
        System.out.println("Abastecendo com energia elétrica");
    }

}
