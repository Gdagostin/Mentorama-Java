public class TestaConta {

    public static void main(String[] args){

        ContaCorrente cc1 = new ContaCorrente(22,1,"Banco AA", 100.00, 500.00);

        ContaPoupanca cp1 = new ContaPoupanca(33,3,"Banco CCC", 10.00, 10, 00.05);

        ContaSalario cs1 = new ContaSalario(44,2,"Banco BBB", 250.00, 2);

        System.out.println("Banco: " + cc1.getBanco());
        System.out.println("Agência: " + cc1.getAgencia());
        System.out.println("Conta número: " + cc1.getNumero());
        System.out.println("O Saldo da conta corrente é R$" + cc1.getSaldo());

        cc1.sacar(550);
        cc1.sacar(100);
        cc1.depositar(100);

        System.out.println("");

        System.out.println("Banco: " + cp1.getBanco());
        System.out.println("Agência: " + cp1.getAgencia());
        System.out.println("Conta número: " + cp1.getNumero());
        System.out.println("O Saldo da conta poupança é R$" + cp1.getSaldo());
        System.out.println("AVISO: O Saldo pode variar dependendo da data Aniversário e da taxa de juros");

        System.out.println("");

        System.out.println("Banco: " + cs1.getBanco());
        System.out.println("Agência: " + cs1.getAgencia());
        System.out.println("Conta número: " + cs1.getNumero());
        System.out.println("O Saldo da conta Salário é R$" + cs1.getSaldo());

        cs1.sacar(30);
        System.out.println("O Saldo da conta Salário é R$" + cs1.getSaldo());
        cs1.sacar(25);
        System.out.println("O Saldo da conta Salário é R$" + cs1.getSaldo());
        cs1.sacar(20);
        System.out.println("O Saldo da conta Salário é R$" + cs1.getSaldo());
        cs1.sacar(15);
        System.out.println("O Saldo da conta Salário é R$" + cs1.getSaldo());
        cs1.sacar(10);
        System.out.println("O Saldo da conta Salário é R$" + cs1.getSaldo());
        cs1.sacar(5);
    }
}
