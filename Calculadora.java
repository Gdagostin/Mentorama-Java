import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        System.out.println("CALCULADORA SIMPLES");

        int opcao;
        do {
            System.out.println("1- Somar");
            System.out.println("2- Subtrair");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.print("O que você deseja fazer? (0 para sair): ");

            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            processar(opcao);
        } while (opcao != 0);
    }

    public static void processar(int opcao) {
        Scanner scanner = new Scanner(System.in);

        switch(opcao) {
            case 1: {
                System.out.println("SOMANDO DOIS NÚMEROS");

                System.out.print("Digite o primeiro número: ");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número: ");
                int numero2 = scanner.nextInt();
                int soma = numero1 + numero2;

                System.out.println("A soma dos dois número é: " + soma);
                break;
            }

            case 2: {
                System.out.println("SUBTRAINDO DOIS NÚMEROS");

                System.out.print("Digite o primeiro número: ");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número: ");
                int numero2 = scanner.nextInt();
                int resultado = numero1 - numero2;

                System.out.println("O resultado da subtração dos dois número й: " + resultado);
                break;

            }
            case 3: {
                System.out.println("MULTIPLICANDO DOIS NÚMEROS");

                System.out.print("Digite o primeiro número: ");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número: ");
                int numero2 = scanner.nextInt();
                int resultado = numero1 * numero2;

                System.out.println("O resultado da multiplicação dos dois números é: " + resultado);
                break;
            }
            case 4: {
                System.out.println("DIVIDINDO DOIS NÚMEROS");

                System.out.print("Digite o primeiro número: ");
                double numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número: ");
                double numero2 = scanner.nextInt();

                if (numero2 ==0) {
                    System.out.println("Impossível dividir por 0");
                } else {
                    double resultado = numero1 / numero2;
                    System.out.println("O resultado da divisão dos dois números é: " + resultado);
                }
                break;
            }    
        }
    }
}
