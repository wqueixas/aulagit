package exercicios;
import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sal=0.0;

        try {
            while(true) {
                try {
                    System.out.println("Digite o salário");
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
//600 1200 2000
        if (sal >= 1200.0) {
            if(sal >= 2000) {System.out.println("30%");}
            else { System.out.println("25%");}
        } else if(sal > 600){System.out.println("20%");}
        else { System.out.println("Isento");}

        teclado.close();
    }
}
