// ======================================================================================================================================================================
// EX 12 - Classe InstrumentoMusical: Crie uma superclasse InstrumentoMusical e subclasses como Violao e Piano, cada uma com um método tocar(). 
// ======================================================================================================================================================================

public class Violao extends InstrumentoMusical {

    public Violao(String marca, String modelo, String cor) {
        super(marca, modelo, cor);
    }

    public void tocar() {
        
        System.out.println("Violão está tocando...");

    }
      

}
