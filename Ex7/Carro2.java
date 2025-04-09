package Ex7;

public class Carro2 extends Veiculo2 {
    // Construtor usa super()
    public Carro2(String marca, String modelo) {
        super(marca, modelo); // chama o construtor da classe Veiculo
    }

    public void abastecer() {
        System.out.println("O carro está sendo abastecido.");
    }
}