package exercicios;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int i, multiplicador;

        System.out.println("Digite um numero:");
        i = teclado.nextInt();

        multiplicador = 1;
        while (true) {
            System.out.printf("%s", multiplicador);
            multiplicador=multiplicador*2;
            if (multiplicador > i) {
                break;
            }
            System.out.print(", ");
        }
System.out.println("");
        multiplicador = 1;
        while (multiplicador <= i) {
            System.out.printf("%s", multiplicador);
            
            if (multiplicador*2 <= i) {
                System.out.print(", ");
            }
            multiplicador=multiplicador*2;
        }
        teclado.close();
    }
}
