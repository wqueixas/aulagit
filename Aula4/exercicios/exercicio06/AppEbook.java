package exercicios.exercicio06;

import java.util.Scanner;

public class AppEbook {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String dir;
        int pagina;
        Ebook ebook = new Ebook("Titulo1", "Autor 1", 10);
        ebook.mostraCapa();

        System.out.println("Digite A(vançar) | R(etroceder) | M(ostrar a página atual) | C(apa) | I(r) para página X(sair)");
        do {

            dir=tec.nextLine();
            if (dir.equalsIgnoreCase("A")) { 
                ebook.avancarPagina();
            } else if (dir.equalsIgnoreCase("R") ) {
                ebook.retrocederPagina();
            } else if (dir.equalsIgnoreCase("M") ) {
                ebook.mostrarPagina();
                System.out.println("Digite A(vançar) | R(etroceder) | M(ostrar a página atual) | C(apa) | I(r) para página X(sair)");
            } else if (dir.equalsIgnoreCase("C") ) {
                ebook.mostraCapa();
                System.out.println("Digite A(vançar) | R(etroceder) | M(ostrar a página atual) | C(apa) | I(r) para página X(sair)");
            } else if (dir.equalsIgnoreCase("I") ) {
                System.out.print("Digite a página: ");
                pagina=tec.nextInt();
                ebook.irPagina(pagina);
            } else if(dir.equalsIgnoreCase("X")) {
            } else {
                System.out.println("Entrada inválida!");
            }
        } while(!dir.equalsIgnoreCase("X"));

        tec.close();
    }
}
