package exercicios;
import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b;

        System.out.println("Digite dois numeros:");
        a=teclado.nextDouble();
        b=teclado.nextDouble();

        if (a > b) {
            System.out.printf("%s, %s", a, b);
        } else {
            System.out.printf("%s, %s", b, a);
        }



        teclado.close();
    }
}
