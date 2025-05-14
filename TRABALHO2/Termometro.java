public class Termometro {

    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temp) {
        if (temp >= -273.15) {
            this.temperatura = temp;
        } else {
            System.out.println("Erro: Temperatura abaixo do zero absoluto não é permitida.");
        }
    }
}