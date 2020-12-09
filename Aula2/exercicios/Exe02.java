package exercicios;
import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, media, limite=6.0;

        System.out.println("Digite as duas notas:");
        a=teclado.nextDouble();
        b=teclado.nextDouble();

        media=0.4*a + 0.6*b;
        if (media >= limite) {
            System.out.println("Aluno aprovado!\n\tNota: "+media);
        } else {
            System.out.println("Aluno reprovado!\n\tNota: "+media);
        }



        teclado.close();
    }
}
