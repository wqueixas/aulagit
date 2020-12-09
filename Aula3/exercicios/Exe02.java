package exercicios;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int i, multiplicador;

        System.out.println("Digite o numero (1 a 10):");
        i = teclado.nextInt();
        multiplicador = 0;
        while (multiplicador <= 10) {
            System.out.printf("%s x %s = %s\n", i, multiplicador, (i * multiplicador));
            multiplicador++;
        }

        teclado.close();
    }
}
