public class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;

    // Método getter para nome
    public String getNome() {
        return nome;
    }

    // Método setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para idade
    public int getIdade() {
        return idade;
    }

    // Método setter para idade com verificação
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade não pode ser negativa.");
        }
    }
}
    

