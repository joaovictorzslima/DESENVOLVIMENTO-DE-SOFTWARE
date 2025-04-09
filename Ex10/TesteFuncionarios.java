package Ex10;

public class TesteFuncionarios {
    public static void main(String[] args) {
        Funcionario f1 = new FuncionarioHorista("João", 25.0, 160);  // 25 reais/hora, 160h mês
        Funcionario f2 = new FuncionarioMensalista("Maria", 3000.0); // salário fixo

        System.out.println("Salário de " + f1.nome + ": R$" + f1.calcularSalario());
        System.out.println("Salário de " + f2.nome + ": R$" + f2.calcularSalario());
    }
}
