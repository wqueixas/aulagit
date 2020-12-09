package exemplos;
import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite o 1o valor");
        int n1=teclado.nextInt();
        System.out.println("Digite o 2o valor");
        int n2=teclado.nextInt();

        System.out.println("A soma de " + n1 + " e " + n2 + " = " + (n1+n2));
        teclado.close();
        
    }
}
