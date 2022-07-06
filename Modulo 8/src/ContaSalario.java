public class ContaSalario extends Conta implements Tributavel {
    private int limite;

    public ContaSalario (int numero, int agencia, String banco, double saldo, int limite) {
        super(numero, agencia, banco, saldo);
        this.limite = limite;
    }



    public double getSaldo() {
        return this.saldo;

    }
    @Override
    public double valorImposto(){
        return this.getSaldo()* 0.01;
    }


    public void sacar(Double valor) {
        if (this.limite == 0) {
            System.out.println("Atingiu o valor máximo de saque");
        }
        else{
            System.out.println("Saques disponiveis: "  + this.limite);
            this.limite --;
            this.saldo -= valor;
        }

    }


    public void depositar(Double valor) {
        this.saldo += valor;

    }
}












