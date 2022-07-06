import java.util.Scanner;

public class Menus {

    Gerente gerente = new Gerente();
    Banco banco = new Banco();

    public void CriarConta(Gerente gerente) {
        Scanner cliente = new Scanner(System.in);
        System.out.print("Digite o nome do Cliente: ");
        String nome = cliente.nextLine();
        gerente.CriarConta(nome);

        int opcao = 0;
        do {
            System.out.println("------------------------------");
            System.out.println("   *** Tipo da conta de Banco ***  ");
            System.out.println("   |1.|  Conta Poupança            |");
            System.out.println("   |2.|  Conta Corrente            |");
            System.out.println("   |3.|  Conta Salário             |");
            System.out.println("   |4.|  Voltar ao Menu Principal  |");
            System.out.println("------------------------------");

            Scanner menu = new Scanner(System.in);
            System.out.print("Digite uma Opção: ");
            opcao = menu.nextInt();

            switch (opcao) {
                case 1:
                    gerente.CriarContaPoupanca(nome);
                    break;
                case 2:
                    gerente.CriarContaCorrente(nome);
                    break;
                case 3:
                    gerente.CriarContaSalario(nome);
                    break;
            }
        } while (opcao < 4);
    }

    public void Sacar(Gerente gerente) {
        Scanner cliente = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = cliente.nextLine();

        int opcao = 0;
        do {
            System.out.println("------------------------------");
            System.out.println("   *** Tipo da conta de Banco ***  ");
            System.out.println("   |1.|  Conta Poupança            |");
            System.out.println("   |2.|  Conta Corrente            |");
            System.out.println("   |3.|  Conta Salário             |");
            System.out.println("   |4.|  Voltar ao Menu Principal  |");
            System.out.println("------------------------------");

            Scanner menu = new Scanner(System.in);
            System.out.print("Digite o Tipo de Conta: ");
            opcao = menu.nextInt();

            switch (opcao) {
                case 1:
                    gerente.SacarPoupanca(nome);
                    break;
                case 2:
                    gerente.SacarCorrente(nome);
                    break;
                case 3:
                    gerente.SacarSalario(nome);
                    break;
            }
        } while (opcao < 4);
    }

    public void Depositar(Gerente gerente) {
        Scanner cliente = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = cliente.nextLine();

        int opcao = 0;
        do {
            System.out.println("------------------------------");
            System.out.println("   *** Tipo da conta de Banco ***  ");
            System.out.println("   |1.|  Conta Poupança            |");
            System.out.println("   |2.|  Conta Corrente            |");
            System.out.println("   |3.|  Conta Salário             |");
            System.out.println("   |4.|  Voltar ao Menu Principal  |");
            System.out.println("------------------------------");

            Scanner menu = new Scanner(System.in);
            System.out.print("Digite o Tipo de Conta: ");
            opcao = menu.nextInt();

            switch (opcao) {
                case 1:
                    gerente.DepositarPoupanca(nome);
                    break;
                case 2:
                    gerente.DepositarCorrente(nome);
                    break;
                case 3:
                    gerente.DepositarSalario(nome);
                    break;
            }
        } while (opcao < 4);
    }

    public void print(Gerente gerente) {
        int tamanho = gerente.contas.size();

        for (int i = 0; i < tamanho; i++) {
            System.out.println(gerente.contas.get(i).getNomeCliente());
        }
    }

    public void transferencia(Gerente gerente) {
        Scanner cliente = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = cliente.nextLine();

        //Destino
        System.out.print("Digite o nome da conta destino: ");
        String destino = cliente.nextLine();

        int opcao = 0;
        do {
            System.out.println("------------------------------    ");
            System.out.println("          *** Transação ***       ");
            System.out.println("   |1.|  Conta Poupança            |");
            System.out.println("   |2.|  Conta Corrente            |");
            System.out.println("   |3.|  Conta Salário             |");
            System.out.println("   |4.|  Voltar ao Menu Principal  |");
            System.out.println("------------------------------");

            Scanner menu = new Scanner(System.in);
            System.out.print("Digite o Tipo de Conta: ");
            Integer tipoDeConta = menu.nextInt();

            System.out.print("Digite o Tipo de Conta Destino: ");
            Integer tipoDeContaDestino = menu.nextInt();

            System.out.print("Digite o valor da transferencia: ");
            Double valor = menu.nextDouble();

            gerente.transferir(tipoDeConta, tipoDeContaDestino, valor, nome, destino);
            break;
        } while (opcao < 2);
    }
}
