import java.util.*;
import java.util.Map.Entry;

public class DiarioDeClasse {
    public static void main (String[] args){
        Map<String, Map<String, Boolean>> presencas = new TreeMap<>();

        Map<String, Boolean> AlissonPresencas = new TreeMap<>();
        AlissonPresencas.put("01/06/2022", true);
        AlissonPresencas.put("02/06/2022", true);
        AlissonPresencas.put("03/06/2022", false);
        AlissonPresencas.put("04/06/2022", true);
        AlissonPresencas.put("05/06/2022", false);

        Map<String, Boolean> BeatrizPresencas = new TreeMap<>();
        BeatrizPresencas.put("01/06/2022", true);
        BeatrizPresencas.put("02/06/2022", true);
        BeatrizPresencas.put("03/06/2022", true);
        BeatrizPresencas.put("04/06/2022", true);
        BeatrizPresencas.put("05/06/2022", false);

        Map<String, Boolean> CleversonPresencas = new TreeMap<>();
        CleversonPresencas.put("01/06/2022", false);
        CleversonPresencas.put("02/06/2022", true);
        CleversonPresencas.put("03/06/2022", true);
        CleversonPresencas.put("04/06/2022", true);
        CleversonPresencas.put("05/06/2022", false);

        Map<String, Boolean> FabianaPresencas = new TreeMap<>();
        FabianaPresencas.put("01/06/2022", true);
        FabianaPresencas.put("02/06/2022", false);
        FabianaPresencas.put("03/06/2022", false);
        FabianaPresencas.put("04/06/2022", true);
        FabianaPresencas.put("05/06/2022", true);

        Map<String, Boolean> GustavoPresencas = new TreeMap<>();
        GustavoPresencas.put("01/06/2022", true);
        GustavoPresencas.put("02/06/2022", true);
        GustavoPresencas.put("03/06/2022", true);
        GustavoPresencas.put("04/06/2022", true);
        GustavoPresencas.put("05/06/2022", true);

        presencas.put("Alisson Mendes", AlissonPresencas);
        presencas.put("Beatriz Oliveira", BeatrizPresencas);
        presencas.put("Cleverson Reinert", CleversonPresencas);
        presencas.put("Fabiana Braga", FabianaPresencas);
        presencas.put("Gustavo Dagostin", GustavoPresencas);

        for (String key: presencas.keySet()) {
            System.out.println(key + " = " + presencas.get(key));
        }
    }
}

