package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int QtdNums=5;
        int cPares=0, cImp=0, cPos=0, cNeg=0, num=0;
        
        for(int i=0; i<QtdNums; i++) {
            num = teclado.nextInt();
            if(num != 0) {
                if(num > 0) {
                    cPos++;
                } else { 
                    cNeg++;
                }
            }
            if(num%2==0){
                cPares++;
            } else {
                cImp++;
            }
        }

        System.out.printf("%d valor(es) par(es)\n", cPares);
        System.out.printf("%d valor(es) impar(es)\n", cImp);
        System.out.printf("%d valor(es) positivo(s)\n", cPos);
        System.out.printf("%d valor(es) negativo(s)\n", cNeg);
        teclado.close();
    }
}
