public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
    }
    @Override
    public double getSaldo() {
        return this.saldo;
    }

    public double sacar(double valor) {
        System.out.println("Valor do saque: R$ " + valor);
        if(valor <= (getSaldo() + chequeEspecial)) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saldo atual: R$ " + getSaldo());

            if(getSaldo() < 0) {
                System.out.println("Valor restante do cheque especial: R$ " + getChequeEspecial());
            }
            return valor;
        }else {
            System.out.println("Você não possui saldo disponível para o saque do cheque especial. Valor atual: R$ " + getChequeEspecial());
        }
        return 0.0;
    }
    @Override
    public double depositar(double valor) {
        System.out.println("Valor do depósito: R$ " + valor);
        setSaldo(getSaldo() + valor);
        System.out.println("Saldo atual R$ " + getSaldo());
        return valor;
    }

    private double getChequeEspecial() {
        if(getSaldo() < 0) {
            return chequeEspecial - Math.abs(getSaldo());
        } else {
            return chequeEspecial;
        }
    }
}