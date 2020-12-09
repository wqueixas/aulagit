package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int QtdNums=6;
        int cPares=0;
        double num=0.0, somaPares=0.0;
        
        for(int i=0; i<QtdNums; i++) {
            num = teclado.nextDouble();
            if (num > 0) {
                cPares++;
                somaPares+=num;
            }
        }

        System.out.printf("%d valores positivos\n", cPares);
        System.out.printf("%.1f\n", (somaPares/cPares));
        teclado.close();
    }
}
