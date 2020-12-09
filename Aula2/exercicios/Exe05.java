package exercicios;
import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pwd="";

        try {
            while(true) {
                try {
                    System.out.println("Digite a senha");
                    pwd=teclado.nextLine();

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

        if (pwd.equals("R10p5")) {
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Senha incorreta!");
        }


        teclado.close();
    }
}
