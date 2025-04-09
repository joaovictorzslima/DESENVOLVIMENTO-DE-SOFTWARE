package Ex3;
public class Exercicio3 {
    // Atributos
    private String nome;
    private double preco;

    // Construtor que recebe nome e preco
    public Exercicio3(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Construtor que recebe apenas o nome
    public Exercicio3(String nome) {
        this.nome = nome;
        this.preco = 0.0; // Valor padrão
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para exibir informações do produto
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        Exercicio3 produto1 = new Exercicio3("Notebook", 3500.00);
        produto1.exibirInformacoes();

        System.out.println();

        Exercicio3 produto2 = new Exercicio3("Mouse");
        produto2.exibirInformacoes();
        produto2.setPreco(79.90);

        System.out.println("\nApós atualizar o preço:");
        produto2.exibirInformacoes();
    }
}