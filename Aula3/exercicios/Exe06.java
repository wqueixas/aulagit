package exercicios;

import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int somapar=0, somaimpar=0, cpar=0, cimpar=0, numero=0;
        
        for(int i=0; i<3; i++) {
            System.out.print("\nDigite o "+ i +"º numero: ");
            numero = teclado.nextInt();
            if (numero%2 == 0) {
                cpar++;
                somapar+=numero;
            } else {
                cimpar++;
                somaimpar+=numero; 
            }
        }

        System.out.printf("\nA média dos valores pares inseridos é: %.2f\n", ((double)somapar/cpar));
        System.out.printf("Foram digitado(s) %s numero(s), %s impar(es) (%.2f%%)", (cpar+cimpar), cimpar, (double)cimpar/(cpar+cimpar)*100);
        teclado.close();
    }
}
