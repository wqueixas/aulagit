package uri;

import java.util.ArrayList;
import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a=teclado.nextInt();
        //100, 50, 20, 10, 5, 2 e 1
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(100);
        list.add(50);
        list.add(20);
        list.add(10);
        list.add(5);
        list.add(2);
        list.add(1);

        int resto=a;
        int notas;
        for (Integer i : list) {
            notas=resto/i;
            System.out.printf("%s nota(s) de R$ %s,00\n", notas, i);
            resto=resto%i;
        }

        teclado.close();
    }
}
