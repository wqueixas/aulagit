package exercicios;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String sNome=teclado.nextLine();
        System.out.println("Digite o salario atual de " + sNome);
        double dSal=0.0;
        while (true) {
            try {
                dSal=teclado.nextDouble();
                break;
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Valor incorreto!!\n" +e.getMessage());
                System.out.println("Digite o salario atual de " + sNome);
                continue;
            }    
        }
        


        //System.out.println("O novo salaraio de " + sNome + " ficou " + (1.25*dSal));
        System.out.printf("%s, de %.2f para %.2f\n", sNome, dSal, 1.25*dSal);
        teclado.close();
    }
}
