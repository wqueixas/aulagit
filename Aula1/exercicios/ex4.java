package exercicios;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Digite o valor do salario minimo: ");
        double dSal=teclado.nextDouble();
        System.out.println("Digite o valor consumido em kW: ");
        double dCons=teclado.nextDouble();
        double dK=dSal/500;
 
        System.out.printf("Valor por KW R$ %.2f\n", dK);
        System.out.printf("Valor a ser pago R$ %.2f (R$ %.2f)\n", dCons*dK, 0.85*dCons*dK);
        teclado.close();
    }
}
