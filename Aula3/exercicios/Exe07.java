package exercicios;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        final int Qtd_Turmas = 2, Qtd_Alunos = 2;
        Scanner teclado = new Scanner(System.in);
        double mGTurma = 0.0, mTurma = 0.0;
        int aluno = 1, turma = 1;

        for (; turma <= Qtd_Turmas; turma++) {
            System.out.println("Insira as medias dos alunos na turma " + turma);
            aluno = 1;
            mTurma = 0.0;
            for (; aluno <= Qtd_Alunos; aluno++) {
                System.out.print("\tInsira a média do aluno " + aluno + " : ");
                mTurma = mTurma+teclado.nextDouble();
            }
            mTurma = mTurma / Qtd_Alunos;
            System.out.printf("\t\tMédia da turma %d = %.2f\n", turma, mTurma);
            mGTurma += mTurma;
        }
        System.out.printf("\nMédia geral das turmas = %.2f", (mGTurma / Qtd_Turmas));

        teclado.close();
    }
}
