package exercicios.exercicio05;

import java.util.Scanner;
public class AppRobo {
    public static void main(String[] args) {
        Robo robo = new Robo();
        String dir;
        System.out.println("Digite N|S|L|O para mover o robo (0 para sair): ");
        Scanner tec = new Scanner(System.in);
        do {
            
            dir=tec.nextLine();
            if (dir.equalsIgnoreCase("N") || dir.equalsIgnoreCase("S") || dir.equalsIgnoreCase("L") || dir.equalsIgnoreCase("O")) {
                robo.movimentar(dir);;
            } else {
                if(!dir.equals("0")) {
                System.out.println("Entrada inválida!");
                }
            }
        } while(!dir.equals("0"));

        tec.close();

    }
    
}
