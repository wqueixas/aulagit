package exercicios;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Digite o valor de fabrica do carro: ");
        double dVal=teclado.nextDouble();
        double dCustoDist=dVal*0.28;
        double dCustoImposto=dVal*0.45;
        double dTotal=dVal + dCustoDist + dCustoImposto;

        System.out.printf("Valor final: R$ %,3.2f (R$ %,3.2f R$ %,3.2f R$ %,3.2f)\n", dTotal, dVal, dCustoDist, dCustoImposto);
        teclado.close();
    }
}
