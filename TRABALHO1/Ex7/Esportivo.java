package Ex7;

public class Esportivo extends Carro2 {
    // Construtor usa super()
    public Esportivo(String marca, String modelo) {
        super(marca, modelo); // chama o construtor da classe Carro (e indiretamente de Veiculo)
    }

    public void turbo() {
        System.out.println("Modo turbo ativado!");
    }
}