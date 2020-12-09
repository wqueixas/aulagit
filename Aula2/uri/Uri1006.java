package uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double a=teclado.nextDouble();
        double b=teclado.nextDouble();
        double c=teclado.nextDouble();
        double med=(a*2 + b*3 + c*5)/10;
        System.out.printf("MEDIA = %.1f\n",med);

        teclado.close();
    }
}
