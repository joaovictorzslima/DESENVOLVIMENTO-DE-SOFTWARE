public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("1984", "George Orwell", 300);

        livro.mostrarInfo();
        livro.ler(50);
        livro.mostrarInfo();
        livro.ler(300);
        livro.mostrarInfo();
        livro.ler(-10);
    }
}