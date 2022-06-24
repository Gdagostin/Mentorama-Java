public class ContaSalario extends Conta {

    private int quantidadeDeSaques;

    public ContaSalario(int numero, int agencia, String banco, double saldo, int quantidadeDeSaques) {
        super(numero, agencia, banco, saldo);
        this.quantidadeDeSaques = 5;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double sacar(double valor) {
        if(quantidadeDeSaques == 0) {
            System.out.println("Voce atingiu a quantidade limite de saques no mês");
        }
        else {
            System.out.println("Quantidade de saques disponíveis: " + quantidadeDeSaques);
            this.quantidadeDeSaques--;
            this.saldo -= valor;
        }
        return 0.0;
    }

    public double depositar(double valor) {
        setSaldo(getSaldo() + valor);
        return valor;
    }

    @Override
    public String toString() {
        return "ContaSalario [quantidadeDeSaques=" + quantidadeDeSaques + "]";
    }
}
