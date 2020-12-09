package exemplos;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor=0, soma=0, cont;

        System.out.println("Digite a quantidade de valores a serem inseridos:");
        cont=teclado.nextInt();

        while (cont > 0) {
            System.out.println("Digite 0 valor:");
            valor=teclado.nextInt();
            soma+=valor;
            cont-=1;
        }
        System.out.println("Soma final: "+soma);

        teclado.close();
    }
}
