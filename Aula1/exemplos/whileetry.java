package exemplos;

import java.util.Scanner;

public class whileetry {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double dSal;
        try {
            while(true) {
                try {
                    System.out.println("Digite o valor do salario minimo: ");
                    dSal=teclado.nextDouble();
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
    }
}
