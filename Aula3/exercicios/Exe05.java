package exercicios;

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int soma=0, numero=1, cont=1;
        
        while (numero != 0) {
            System.out.print("\nDigite o "+ cont +"º numero (0 para sair): ");
            numero = teclado.nextInt();
            soma+=numero;
            cont++;
        }
        System.out.println("No final, a soma foi: "+ soma);
        teclado.close();
    }
}
