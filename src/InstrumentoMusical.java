// ======================================================================================================================================================================
// EX 12 - Classe InstrumentoMusical: Crie uma superclasse InstrumentoMusical e subclasses como Violao e Piano, cada uma com um método tocar(). 
// ======================================================================================================================================================================

public class InstrumentoMusical {

    private String marca;
    private String modelo;
    private String cor;
   
    public InstrumentoMusical(String marca, String modelo, String cor) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;

    }

    public void tocar() {

        System.out.println("Instrumento fez som");

    }

    

}
