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

    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public double valorImposto() {
        return this.chequeEspecial * 0.02;

    }

    public double getChequeEspecial() {
        if(getSaldo() < 0) {
            return chequeEspecial - Math.abs(getSaldo());
        } else {
            return chequeEspecial;
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;

    }

    public void sacar(double valor) {
        if(valor <= (getSaldo() + chequeEspecial)) {
            setSaldo(getSaldo() - valor);

            if(getSaldo() < 0) {
                System.out.println("Valor restante do cheque especial: R$ " + getChequeEspecial());
            }
        }else {
            System.out.println("Você não possui saldo disponível para o saque do cheque especial. Valor atual: R$ " + getChequeEspecial());
        }
    }
}
















