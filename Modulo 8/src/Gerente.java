import java.util.ArrayList;
import java.util.Scanner;

public class Gerente {
    protected ArrayList<Banco> contas = new ArrayList<>();


    public void CriarConta(String nome) {
        Banco banco = new Banco();
        banco.setNomeCliente(nome);
        contas.add(banco);
        System.out.print(contas.size());
    }

    public void CriarContaPoupanca(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                Scanner cliente = new Scanner(System.in);
                System.out.print("Digite o saldo Inicial da Conta: ");
                Double saldo = cliente.nextDouble();

                System.out.print("Digite o dia do seu Aniversário: ");
                int dia = cliente.nextInt();

                Scanner cliente2 = new Scanner(System.in);
                System.out.print("Digite o numero da conta: ");
                int numeroDeConta = cliente2.nextInt();

                conta.CriarContaPoupanca(numeroDeConta, 1785,"CEF", saldo,  dia, 0.05 );

            }
        }
    }

    public void CriarContaCorrente(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                Scanner cliente = new Scanner(System.in);
                System.out.print("Digite o saldo Inicial da Conta: ");
                Double saldo = cliente.nextDouble();

                System.out.print("Digite o valor do seu cheque especial: ");
                Double cheque = cliente.nextDouble();

                Scanner cliente2 = new Scanner(System.in);
                System.out.print("Digite o numero da conta: ");
                int numeroDeConta = cliente2.nextInt();

                conta.CriarContaCorrente(numeroDeConta, 1785, "CEF", saldo, cheque);

            }
        }
    }

    public void CriarContaSalario(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                Scanner cliente = new Scanner(System.in);
                System.out.print("Digite o saldo Inicial da Conta: ");
                Double saldo = cliente.nextDouble();

                System.out.print("Digite a quantidades de saques mensais: ");
                int saques = cliente.nextInt();

                Scanner cliente2 = new Scanner(System.in);
                System.out.print("Digite o numero da conta: ");
                int numeroDeConta = cliente2.nextInt();

                conta.CriarContaSalario(numeroDeConta, 1785, "CEF",saldo, saques);

            }
        }
    }

    public void SacarPoupanca(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                System.out.println(
                        conta.getNomeCliente() + " - " + conta.ContaPoupanca.getSaldo()
                );

                Scanner cliente = new Scanner(System.in);
                System.out.print("Digite o quanto quer Sacar: ");
                Double valor = cliente.nextDouble();
                conta.sacarContaPoupanca(valor);
            }
        }
    }

    public void SacarCorrente(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                Scanner cliente = new Scanner(System.in);
                System.out.print("Digite o quanto quer Sacar: ");
                Double valor = cliente.nextDouble();
                conta.sacarContaCorrente(valor);
            }
        }
    }

    public void SacarSalario(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                Scanner cliente = new Scanner(System.in);
                System.out.print("Digite o quanto quer Sacar: ");
                Double valor = cliente.nextDouble();
                conta.sacarContaSalario(valor);
            }
        }
    }

    public void DepositarPoupanca(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                Scanner cliente = new Scanner(System.in);
                System.out.print("Digite o valor de deposito: ");
                Double valor = cliente.nextDouble();
                conta.depositarContaPoupanca(valor);
            }
        }
    }

    public void DepositarSalario(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                Scanner cliente = new Scanner(System.in);
                System.out.print("Digite o valor de deposito: ");
                Double valor = cliente.nextDouble();
                conta.depositarContaSalario(valor);
            }
        }
    }

    public void DepositarCorrente(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                Scanner cliente = new Scanner(System.in);
                System.out.print("Digite o valor de deposito: ");
                Double valor = cliente.nextDouble();
                conta.depositarContaCorrente(valor);
            }
        }
    }

    public void Saldo() {
        Scanner cliente = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = cliente.nextLine();

        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                System.out.println(conta.getNomeCliente());

                System.out.println(conta.Saldo());
            }
        }
    }

    public void ContasCadastradas() {
        System.out.println("       | PESSOAS CADASTRADAS |");
        for (Banco conta : this.contas) {
            System.out.println("Nome: " + conta.getNomeCliente() +" |  Saldo da conta: " +  conta.Saldo() +" | Numero da Conta: "+ conta.numeroDeConta());
        }
    }

    public void transferir(Integer tipoDeConta, Integer tipoDeContaDestino, Double valor, String nome, String destino) {
        for (Banco conta : contas) {
            if (conta.getNomeCliente().equals(nome)) {
                conta.transferir(valor, tipoDeConta, "sacar");
            }

            if (conta.getNomeCliente().equals(destino)) {
                conta.transferir(valor, tipoDeContaDestino, "depositar");
            }
        }
    }
}

