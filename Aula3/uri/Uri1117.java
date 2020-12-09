package uri;

import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int QtdPos=2;
        double score=0.0, mediaScores=0.0;
        int cScores=0;
        
        do {
            score=teclado.nextDouble();
            if((score >= 0.0) && (score <= 10.0)) {
                cScores++;
                mediaScores+=score;
            } else {
                System.out.println("nota invalida");
            }
        } while (cScores < QtdPos);
        System.out.printf("media = %.2f\n",mediaScores/QtdPos);

        teclado.close();
    }
}
