package uri;

import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String pwd="";
        boolean teste=true;
        
        do {
            pwd=teclado.nextLine();
            teste=!pwd.equals("2002");
            if(teste) {
                System.out.println("Senha invalida");
            } else {
                System.out.println("Acesso Permitido");
            }
        } while (teste);

        teclado.close();
    }
}
