package uri;

import java.util.Scanner;

public class Uri1057 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double a=teclado.nextFloat();
        double tax1=0.08, tax2=0.18, tax3=0.28;
        double imp1=0.0, imp2=0.0, imp3=0.0, devido=0.0;

        if(a <= 2000) {
            System.out.println("Isento");
        } else {
            if (a > 4500) {
                imp3=(a-4500)*tax3;
                imp2=(4500-3000.01)*tax2;
                imp1=(3000-2000.01)*tax1;
            } else if (a > 3000) {
                imp2=(a-3000)*tax2;
                imp1=(3000-2000.01)*tax1;
            } else {
                imp1=(a-2000)*tax1;
            }
            

            devido=imp1+imp2+imp3;
            System.out.printf("R$ %.2f\n", devido);
        }

        teclado.close();
    }
}
