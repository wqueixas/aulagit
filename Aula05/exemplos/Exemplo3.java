package exemplos;

import java.util.HashMap;

public class Exemplo3 {
    public static void main(String[] args) {
        HashMap<Integer,String> mapa = new HashMap<>();

        mapa.put(0, "João");
        mapa.put(1, "Carlos");
        mapa.put(2, "Wallace");
        System.out.println(mapa.get(2));
        
    }
}
