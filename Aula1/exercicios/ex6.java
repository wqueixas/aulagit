package exercicios;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Digite o valor em KMs: ");
        double km=teclado.nextDouble();

        double milha = km*0.62137;
        double jarda = milha*1760;
        double pe = jarda*3;
        double pol=pe*12;

        System.out.printf("KM: %,3.2f\n", km);
        System.out.printf("%,3.2f kms são %,3.2f milhas\n", km, milha);
        System.out.printf("%,3.2f kms são %,3.2f jardas\n", km, jarda);
        System.out.printf("%,3.2f kms são %,3.2f pes\n", km, pe);
        System.out.printf("%,3.2f kms são %,3.2f polegadas\n", km, pol);
        teclado.close();
    }
}
