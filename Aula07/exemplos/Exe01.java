package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int numero;
        String str;
        double d;

        
        try {
            System.out.println("Digite um numero inteiro:");
            numero = tec.nextInt();
            System.out.println("Digite uma representação de um inteiro:");
            numero = Integer.parseInt(tec.nextLine());
            System.out.println("Digite uma representação de um double:");
            d=Double.parseDouble(tec.nextLine());

        } catch (InputMismatchException e) {
            System.out.println("Erro no tipo de dado digitado");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tec.next();
            tec.close();
        }
    }
}
