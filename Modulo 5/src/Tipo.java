public class Tipo {


    public static void main(String[] args) {
        Integer numero = new Integer(27);
        String numeroString = String.valueOf(numero);
        String valor = new String("155.42");
        Double valorDouble = Double.valueOf(valor);
        Float valorFloat = Float.valueOf(valor);

        System.out.println("numero Integer: " + numero);
        System.out.println("numero String: " + numeroString);
        System.out.println("valor String: " + valor);
        System.out.println("valor Double: " + valorDouble);
        System.out.println("valor Float: " + valorFloat);
    }
}
