package Ex9;

public class Calculadora {

    // Método somar para inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Método somar para doubles
    public double somar(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
    
        // Teste com inteiros
        int resultadoInt = calc.somar(100, 20);
        System.out.println("Soma de inteiros: " + resultadoInt);
    
        // Teste com doubles
        double resultadoDouble = calc.somar(5.5, 3.2);
        System.out.println("Soma de doubles: " + resultadoDouble);
    
        // Teste com um int e um double (conversão automática)
        double resultadoMisto = calc.somar(7.0, 3);
        System.out.println("Soma mista (double + int): " + resultadoMisto);
    }
}