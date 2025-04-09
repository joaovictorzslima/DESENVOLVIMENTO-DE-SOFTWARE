package Ex4;
// Classe derivada Gerente

public class Gerente4 extends Exercicio4 {
    private String departamento;

    // Construtor
    public Gerente4(String nome, double salario, String departamento) {
        super(nome, salario); // chama o construtor da classe Funcionario
        this.departamento = departamento;
    }

    // Método para exibir informações do gerente
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // chama método da superclasse
        System.out.println("Departamento: " + departamento);
    }

    // Método main para testar
    public static void main(String[] args) {
        Gerente4 gerente1 = new Gerente4("Carlos Silva", 8500.00, "TI");
        gerente1.exibirInformacoes();
    }
}