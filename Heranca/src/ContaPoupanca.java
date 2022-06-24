public class ContaPoupanca extends Conta{
    private int diaAniversario;
    private double taxaJuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaJuros = taxaJuros;
    }

    public double getSaldo() {
        if (this.diaAniversario == 20) {
            return this.saldo + this.saldo * this.taxaJuros;}
            if (this.diaAniversario == 10) {
                return this.saldo + this.saldo * this.taxaJuros ;
        } else {
            return this.saldo;
        }
    }
    public double sacar(double valor) {
        setSaldo(getSaldo() - valor);
        return valor;
    }

    public double depositar(double valor) {
        setSaldo(getSaldo() + valor);
        return valor;
    }

    @Override
    public String toString() {
        return super.toString() + " ContaPoupanca [diaAniversario=" + diaAniversario + ", taxaDeJuros=" + taxaJuros + "]";
    }

}
