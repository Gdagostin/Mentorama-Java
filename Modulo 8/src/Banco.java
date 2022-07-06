public class Banco{

    protected String NomeCliente;
    protected ContaPoupanca ContaPoupanca;
    protected ContaCorrente ContaCorrente;
    protected ContaSalario  ContaSalario;
    protected Conta transferir;



    public String getNomeCliente(){
        return this.NomeCliente;
    }

    public void setNomeCliente(String nome){
        this.NomeCliente=nome;
    }



    public void CriarContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros){
        this.ContaPoupanca=new ContaPoupanca(numero, agencia,banco,saldo,diaAniversario,taxaDeJuros);
    }

    public void CriarContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial){
        this.ContaCorrente=new ContaCorrente(numero,agencia,banco,saldo,chequeEspecial);
    }

    public void CriarContaSalario(int numero, int agencia, String banco, double saldo, int limite){
        this.ContaSalario=new ContaSalario(numero,agencia,banco,saldo,limite);
    }

    public void sacarContaPoupanca(double valor){
        this.ContaPoupanca.sacar(valor);
        System.out.println(this.ContaPoupanca.getSaldo());
    }

    public void sacarContaCorrente(double valor){
        this.ContaCorrente.sacar(valor);
        System.out.println(this.ContaCorrente.getSaldo());

    }

    public void sacarContaSalario(double valor){
        this.ContaSalario.sacar(valor);
        System.out.println(this.ContaSalario.getSaldo());

    }

    public void depositarContaPoupanca(double valor){
        this.ContaPoupanca.depositar(valor);
        System.out.println(this.ContaPoupanca.getSaldo());
    }
    public void depositarContaSalario(double valor){
        this.ContaSalario.depositar(valor);
        System.out.println(this.ContaSalario.getSaldo());
    }

    public void depositarContaCorrente(double valor){
        this.ContaCorrente.depositar(valor);
        System.out.println(this.ContaCorrente.getSaldo());
    }

    public void transferir( Double valor, Integer tipoDeConta ,String operacao){
        String sacar="sacar";
        String depositar="depositar";


        if(sacar.equals(operacao)){
            switch(tipoDeConta){
                case 1:
                    this.ContaPoupanca.sacar(valor);
                    break;
                case 2:
                    this.ContaCorrente.sacar(valor);
                    break;
                case 3:
                    this.ContaSalario.sacar(valor);
                    break;
                default:
                    System.out.println("Nenhuma Opção encontrada");
            }
        }

        if(depositar.equals(operacao)){
            switch(tipoDeConta){
                case 1:
                    this.ContaPoupanca.depositar(valor);
                    break;
                case 2:
                    this.ContaCorrente.depositar(valor);
                    break;
                case 3:
                    this.ContaSalario.depositar(valor);
                    break;
                default:
                    System.out.println("Nenhuma Opção encontrada");
            }
        }




    }

    public Double Saldo(){
        Double saldo = 0.0;

        if(ContaPoupanca != null ){
            saldo += ContaPoupanca.getSaldo();
        }

        if(ContaCorrente != null ){
            saldo += ContaCorrente.getSaldo();
        }

        if(ContaSalario != null ){
            saldo += ContaSalario.getSaldo();
        }

        return saldo;

    }

    public int numeroDeConta(){
        int numero = 0;

        if(ContaPoupanca != null ){
            numero += ContaPoupanca.getNumero();

        }

        if(ContaCorrente != null ){
            numero += ContaCorrente.getNumero();

        }

        if(ContaSalario != null ){
            numero += ContaSalario.getNumero();

        }


        return numero;
    }


}

