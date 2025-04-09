package Ex7;

// Classe base Veiculo
public class Veiculo2 {
    protected String marca;
    protected String modelo;

    // Construtor
    public Veiculo2(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mover() {
        System.out.println("O veículo está se movendo.");
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
