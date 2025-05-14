package Ex11;

// Classe Documento que implementa Imprimivel
class Documento implements Imprimivel {
    private String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo documento: " + titulo);
    }
}