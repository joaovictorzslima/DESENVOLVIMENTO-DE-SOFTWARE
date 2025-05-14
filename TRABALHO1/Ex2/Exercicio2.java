package Ex2;
public class Exercicio2 {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;

    // Construtor
    public Exercicio2(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para exibir as informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        Exercicio2 carro1 = new Exercicio2("Toyota", "Corolla", 2020);
        carro1.exibirInformacoes();

        // Alterando valores
        carro1.setModelo("Hilux");
        carro1.setAno(2022);

        System.out.println("\nInformações atualizadas:");
        carro1.exibirInformacoes();
    }
}