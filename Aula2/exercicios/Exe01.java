package exercicios;
import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a;
        int limite=20;

        try {
            while(true) {
                try {
                    System.out.println("Digite um numero inteiro");
                    a=teclado.nextInt();
                    if(a >= limite) { System.out.printf("A metade inteira de %s é %f ", a, (float)a/2);
                    } else { System.out.println("Numero menor que 20");  }
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
        teclado.close();
    }
}
