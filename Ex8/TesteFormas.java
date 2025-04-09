package Ex8;

public class TesteFormas {
    public static void main(String[] args) {
        // Array de formas
        Forma[] formas = new Forma[4];
        formas[0] = new Circulo(3.0);
        formas[1] = new Quadrado(4.0);
        formas[2] = new Circulo(5.5);
        formas[3] = new Quadrado(2.5);

        // Usando polimorfismo para calcular áreas
        for (int i = 0; i < formas.length; i++) {
            System.out.println("Área da forma " + (i + 1) + ": " + formas[i].calcularArea());
        }
    }
}