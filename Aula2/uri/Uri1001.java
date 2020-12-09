package uri;

import java.util.Scanner;

public class Uri1001 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A, B, res;
        A=teclado.nextInt();
        B=teclado.nextInt();
        res=A + B;
        //res=teclado.nextInt() + teclado.nextInt();

        System.out.println("X = " + res);
        teclado.close();
    }
}
