package Ex1;
public class Exercicio1 {
    // Atributos
    private String nome;
    private int idade;

    // Construtor
    public Exercicio1(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para exibir as informações da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        Exercicio1 pessoa1 = new Exercicio1("Joao", 25);
        pessoa1.exibirInformacoes();
    }
}