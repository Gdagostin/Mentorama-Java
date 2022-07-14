import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestaConta {

    public static void main(String[] args){

        Cliente cli1 = new Cliente("Gustavo", true,"123", 10);
        Cliente cli2 = new Cliente("Mentorama", true,"abc", 30);
        Cliente cli3 = new Cliente("Brasil", false,"333", 50);
        Cliente cli4 = new Cliente("China", true,"444", 60);
        Cliente cli5 = new Cliente("EAU", true,"555", 80);
        Cliente cli6 = new Cliente("Noruega", true,"456", 100);
        Cliente cli7 = new Cliente("Finlândia", false,"777", 45);
        Cliente cli8 = new Cliente("Canadá", true,"888", 26);
        Cliente cli9 = new Cliente("Argentina", true,"999", 88);
        Cliente cli10 = new Cliente("Estônia", true,"1010", 15);

        List<Cliente> clientes = Arrays.asList(cli1,cli2,cli3,cli4,cli5,cli6,cli7,cli8,cli9,cli10);

        List<Cliente> clientesFiltrados = clientes.stream().filter(cliente -> cliente.getCompras()>=0).toList();
        for(Cliente cliente :  clientesFiltrados) {

        }
        Comparator<Cliente> Menor =Comparator.comparing(Cliente::getCompras);
        List<Cliente> menorCompra = clientesFiltrados.stream().min(Menor).stream().toList();
        System.out.print("Cliente com menos Compras ");
        System.out.println(menorCompra);
        System.out.println("------------------------");


        Comparator<Cliente> Maior= Comparator.comparing(Cliente::getCompras);
        List<Cliente>maiorCompra = clientesFiltrados.stream().max(Maior).stream().toList();
        System.out.print("Cliente com mais Compras ");
        System.out.println(maiorCompra);
        System.out.println("------------------------");


        System.out.println("A Média de compras é de : " + clientes.stream().mapToDouble(Cliente::getCompras).average().getAsDouble());

    }
}