class Jogador {
    private String nome;
    private int vida;
    private int forca;

    public Jogador(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public void atacar(Jogador outroJogador) {
        outroJogador.vida -= this.forca; // Subtrai a força do jogador atual da vida do outro jogador
        System.out.println(this.nome + " atacou " + outroJogador.nome + " causando " + this.forca + " de dano.");
    }

    public void mostrarStatus() {
        System.out.println("Jogador: " + nome + " | Vida: " + vida + " | Força: " + forca);
    }
}
