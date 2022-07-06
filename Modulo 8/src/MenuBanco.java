
import java.util.Scanner;
public class MenuBanco {

    public static void main (String[] args){
        Menus menus = new Menus();
        Gerente gerente = new Gerente();

        int opcao=0;
        do{

            System.out.println("--------------------------------------");
            System.out.println("       *** Banco Digital ***          ");
            System.out.println("   |1.|  Criar Conta                 |");
            System.out.println("   |2.|  Sacar                       |");
            System.out.println("   |3.|  Depositar                   |");
            System.out.println("   |4.|  Transferir valores          |");
            System.out.println("   |5.|  Mostrar montante nas contas |");
            System.out.println("   |6.|  Contas Cadastradas          |");
            System.out.println("   |7.|  Sair                        |");
            System.out.println("--------------------------------------");

            Scanner menu=new Scanner(System.in);
            System.out.print("Digite uma Opção: ");
            opcao= menu.nextInt();

            switch(opcao){
                case 1:
                    menus.CriarConta(gerente);
                    break;
                case 2:
                    menus.Sacar(gerente);
                    break;
                case 3:
                    menus.Depositar(gerente);
                    break;
                case 4:
                    menus.transferencia(gerente);
                    break;
                case 5:
                    gerente.Saldo();
                    break;

                case 6:
                    gerente.ContasCadastradas();
                    break;
                case 7:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }


        }while(opcao!=7);


    }
}    
    
 
  