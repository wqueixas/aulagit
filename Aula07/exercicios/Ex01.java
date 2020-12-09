package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double a, b;
        boolean erro=true;

        do {
            try {
                System.out.println("\nDigite 2 numeros: ");
                a=Double.parseDouble(tec.nextLine());
                b=Double.parseDouble(tec.nextLine());
                if(b==0) throw new ArithmeticException("Você se lembra que divisões por zero resultam num numero infinito, certo?");

                System.out.printf("%f dividido por %f é igual a: %f\n\n", a, b, a/b);
                erro=false;
            } catch (InputMismatchException e) {
                System.out.println("Houve um erro na digitação, por favor digite apenas numeros");
            } catch (NumberFormatException e) {
                System.out.println("Atenção, numeros decimais devem usar pontos e nao virgulas");
            } catch (ArithmeticException e) {
                System.out.println(e.getLocalizedMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while(erro);
        tec.close();
    }
}
