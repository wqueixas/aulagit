package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a=teclado.nextInt();
        int b=teclado.nextInt();
        double c=teclado.nextDouble();
        int d=teclado.nextInt();
        int e=teclado.nextInt();
        double f=teclado.nextDouble();
        double valor=(b*c + e*f);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",valor);

        teclado.close();
    }
}
