package exercicios;
import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sal=0.0, prest=0.0;

        try {
            while(true) {
                try {
                    System.out.println("Digite o salario");
                    sal=teclado.nextDouble();

                    break;
                } catch (Exception e) {
                    //TODO: handle exception
                    System.out.println("Valor invalido!!");
                    teclado.next();
                    continue;
                }              
            }
        } catch (Exception e) {
            //TODO: handle exception            
        }

        try {
            while(true) {
                try {
                    System.out.println("Digite o valor da prestação");
                    prest=teclado.nextDouble();

                    break;
                } catch (Exception e) {
                    //TODO: handle exception
                    System.out.println("Valor invalido!!");
                    teclado.next();
                    continue;
                }              
            }
        } catch (Exception e) {
            //TODO: handle exception            
        }

        if (prest > 0.3*sal) {
            System.out.println("Valor da prestação "+ prest +" superior ao limite ( "+ 0.3*sal +")!");
        } else {
            System.out.println("Empréstimo liberado!\nPrestação:\t"+prest);
        }
        teclado.close();
    }
}
