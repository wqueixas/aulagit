package exercicios;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome=teclado.nextLine();
        System.out.println("Digite a 1a nota");
        double n1=teclado.nextDouble();
        System.out.println("Digite a 2a Nota");
        double n2=teclado.nextDouble();

        System.out.println("A média de " + nome + " ficou " + ((n1+n2)/2));
        teclado.close();
    }
}
