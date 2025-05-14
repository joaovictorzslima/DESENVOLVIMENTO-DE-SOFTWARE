public class Livro {

    private String titulo;
    private String autor;
    private int paginasLidas;
    private int totalPaginas;

    public Livro(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginasLidas = 0;
    }

    public void ler(int paginas) {
        if (paginas > 0) {
            paginasLidas += paginas;
            if (paginasLidas > totalPaginas) {
                paginasLidas = totalPaginas;
            }
        } else {
            System.out.println("Número de páginas inválido para leitura.");
        }
    }

    public double progresso() {
        if (totalPaginas == 0) return 0;
        return ((double) paginasLidas / totalPaginas) * 100;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas lidas: " + paginasLidas + "/" + totalPaginas);
        System.out.printf("Progresso: %.2f%%\n", progresso());
    }
}