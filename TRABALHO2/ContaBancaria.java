public class ContaBancaria {
    
    String titular;
    Double saldo;

    public ContaBancaria(String titular, double saldo){

        this.titular = titular;
        this.saldo = saldo;

    }

    public void depositar(double valor){

        if(valor > 0 ){
            this.saldo += valor;
            System.out.println("Valor Depositado R$: " + valor);
        }else{
            System.out.println("Valor invalido para deposito");
        }
    }

    public void sacar(double valor){

        if(valor > 0 && valor < this.saldo){
            this.saldo -= valor;
            System.out.println("Valor Sacado R$: ");
        }else{
            System.out.println("Valor indisponivel para saque!");
        }
    }

    public void mostrarSaldo(){
        System.out.println(titular + " O seu saldo é R$: " + saldo);
    }


}
