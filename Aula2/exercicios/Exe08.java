package exercicios;
import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a=0, b=0, c=0;

        try {
            while(true) {
                try {
                    System.out.println("Digite os valores dos lados do suposto triangulo");
                    a=teclado.nextInt();
                    b=teclado.nextInt();
                    c=teclado.nextInt();

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
        if(a > (b+c) || b > (a+c) || c > (a+b)) {
            System.out.println("Nao formam um trinagulo");
        } else if (a==b && b==c) {
            System.out.println("Triangulo equilatero");
        } else if(a==b || b==c || a==c){
            System.out.println("Triangulo isósceles");
        } else System.out.println("Triangulo escaleno");

        teclado.close();
    }
}
