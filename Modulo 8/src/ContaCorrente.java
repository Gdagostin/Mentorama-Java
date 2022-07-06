public class ContaCorrente extends Conta implements Tributavel {
    private double chequeEspecial;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }
    @Override
    public String toString() {
        return "ContaCorrente:  " +
                "chequeEspecial = " + chequeEspecial +
                '}';
    }

    @Override
    public double valorImposto(){
        return this.chequeEspecial* 0.02;

    }



    public void sacar(Double valor) {
        if(saldo > this.getSaldo()) {
            System.out.println("Saldo indisponivel para o valor de saque");
        }
        else {
            this.saldo-=saldo;

        }

    }

    public void depositar(Double valor) {
        this.saldo+=saldo;

    }

    public double getSaldo() {
        return (this.chequeEspecial + this.saldo);


    }
}
















