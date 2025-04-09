package Ex11;

// Classe principal para teste
public class TesteImpressao {
    public static void main(String[] args) {
        Imprimivel doc = new Documento("Contrato de Aluguel");
        Imprimivel foto = new Foto("foto_viagem.jpg");

        doc.imprimir();
        foto.imprimir();
    }
}