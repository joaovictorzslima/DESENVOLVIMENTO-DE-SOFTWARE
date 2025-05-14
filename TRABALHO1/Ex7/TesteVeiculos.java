package Ex7;

public class TesteVeiculos {
    public static void main(String[] args) {
        Esportivo esportivo = new Esportivo("Ferrari", "F8 Tributo");

        esportivo.exibirInformacoes();  // herdado de Veiculo
        esportivo.mover();              // herdado de Veiculo
        esportivo.abastecer();          // herdado de Carro
        esportivo.turbo();              // próprio de Esportivo
    }
}