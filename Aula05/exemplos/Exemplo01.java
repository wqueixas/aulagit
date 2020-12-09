package exemplos;

import java.util.ArrayList;

public class Exemplo01 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(2);
        lista.add(8);
        lista.add(20);
        lista.add(8);

        System.out.println(lista);
        System.out.println("Tamanho da lista: "+lista.size());
        for(int i = 0; i < lista.size();i++){
            if (lista.get(i) == 8){
                System.out.println("encontrado em "+i);
            }
        }

        for(Integer item:lista){
            System.out.println(item);
            if(item == 2) {
                System.out.println("Item "+item+" encontrado");
            }
        }
        System.out.println("Remove o elemento 0, o " +lista.remove(0));
        System.out.println(lista);
    }
}