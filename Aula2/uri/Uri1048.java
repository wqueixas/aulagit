package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float a=teclado.nextFloat();
        double novosal=0.0, reaj=0.0;
        int pct=0;

        if(a>0 && a <= 400) {
            pct=15;
        } else if(a <= 800) {
            pct=12;
        } else if(a <= 1200) {
            pct=10;
        } else if(a <= 2000) {
            pct=7;
        } else {
            pct=4;
        }
        reaj=a*pct/100;
        novosal=a+reaj;
        System.out.printf("Novo salario: %.2f\n",novosal);
        System.out.printf("Reajuste ganho: %.2f\n", reaj);
        System.out.printf("Em percentual: %s %%\n", pct);

        teclado.close();
    }
}
