// ======================================================================================================================================================================
// EX 12 - Classe InstrumentoMusical: Crie uma superclasse InstrumentoMusical e subclasses como Violao e Piano, cada uma com um método tocar(). 
// ======================================================================================================================================================================

public class Piano extends InstrumentoMusical {

    public Piano(String marca, String modelo, String cor) {
        super(marca, modelo, cor);
    }

    public void tocar() {

        System.out.println("Piano está tocando...");
        
    }

}
