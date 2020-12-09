package uri;

import java.util.Scanner;

public class Uri1003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int soma=teclado.nextInt() + teclado.nextInt();
        System.out.println("SOMA = "+soma);

        teclado.close();
    }
}
