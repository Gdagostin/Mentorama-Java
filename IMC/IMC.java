import java.util.Scanner;
public class IMC {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String nome;
        float peso, altura, calculo;
           
        System.out.print("Nome da Pessoa: ");
        nome = ler.nextLine();
        System.out.print("Peso da Pessoa (kg): ");
        peso = ler.nextFloat();
        System.out.print("Altura da Pessoa (m): ");
        altura = ler.nextFloat();
        ler.nextLine();
        
        calculo = peso / (altura * altura);

        System.out.println("O IMC de " +nome+ " é de: " + calculo);
    
       if (calculo <= 19)
            System.out.print("Abaixo do Peso");
       else
          if (calculo <= 25)
            System.out.print("Peso ideal");
          else
             if (calculo <= 30)
                System.out.print("Acima do Peso");
             else
                if (calculo <= 35)
                    System.out.print("Obesidade Leve");
                    else
                        System.out.print("Obesidade");
    }
}