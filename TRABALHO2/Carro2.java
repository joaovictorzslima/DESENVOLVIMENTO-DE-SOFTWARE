public class Carro2 {

    private String modelo;
    private int velocidade;

    public Carro2(String modelo) {
        this.modelo = modelo;
        this.velocidade = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar(int valor) {
        if (valor > 0) {
            velocidade += valor;
        } else {
            System.out.println("Valor inválido para aceleração.");
        }
    }

    public void frear(int valor) {
        if (valor > 0) {
            velocidade -= valor;
            if (velocidade < 0) {
                velocidade = 0;
            }
        } else {
            System.out.println("Valor inválido para frenagem.");
        }
    }

    public void mostrarStatus() {
        System.out.println("Modelo: " + modelo + " | Velocidade: " + velocidade + " km/h");
    }
}