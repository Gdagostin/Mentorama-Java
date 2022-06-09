import java.util.ArrayList;
import java.util.HashMap;

public class DiarioDeClasse {
    public static void main (String[] args){
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Alisson");
        nomes.add("Beatriz");
        nomes.add("Cleverson");
        nomes.add("Douglas");
        nomes.add("Fabio");
        nomes.add("Gustavo");

        HashMap<String, String> map = new HashMap<>();
        map.put("01/06/2022", "Ausente" );
        map.put("02/06/2022", "Presente");
        map.put("03/06/2022", "Presente");
        map.put("04/06/2022","Ausente");
        map.put("05/06/2022", "Ausente");
        map.put("06/06/2022", "Presente");

        System.out.println(nomes.get(0));
        System.out.println(map.get("02/06/2022"));
    }
}

