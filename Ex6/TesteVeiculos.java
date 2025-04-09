package Ex6;

public class TesteVeiculos {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.mover();

        System.out.println();

        Carro carro = new Carro();
        carro.mover();       // herdado de Veiculo
        carro.abastecer();   // próprio de Carro

        System.out.println();

        Esportivo esportivo = new Esportivo();
        esportivo.mover();       // herdado de Veiculo
        esportivo.abastecer();   // herdado de Carro
        esportivo.turbo();       // próprio de Esportivo
    }
}