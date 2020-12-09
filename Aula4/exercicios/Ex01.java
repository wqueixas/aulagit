package exercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        teste();
    }
    public static void teste() {
        Scanner tec = new Scanner(System.in);
        int i=0;
        do {
            System.out.print("\nDigite um numero: ");
            i=tec.nextInt();
            System.out.print("\n " + i + " é "+ parOUimpar(i));
            System.out.print(", " + posOuNeg(i));
        } while (i!=0);
        tec.close();
    }
    public static String parOUimpar(int num) {
        String aval="impar";
        if (num%2==0){
            aval="par";
        }
        return aval;
    }
    public static String posOuNeg(int num) {
        String aval="Negativo";
        if (num>0){
            aval="Positivo";
        }
        return aval;
    }
}
