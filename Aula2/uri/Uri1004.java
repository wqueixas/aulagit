package uri;

import java.util.Scanner;

public class Uri1004 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int prod=teclado.nextInt() * teclado.nextInt();
        System.out.println("PROD = "+prod);

        teclado.close();
    }
}
