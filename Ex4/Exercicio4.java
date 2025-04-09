package Ex4;
// Classe base Funcionario
public class Exercicio4 {
    protected String nome;
    protected double salario;

    // Construtor
    public Exercicio4(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método para exibir informações do funcionário
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
    }
}
