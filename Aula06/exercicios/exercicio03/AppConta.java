package exercicios.exercicio03;

import java.util.Scanner;

public class AppConta {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int nrconta, op;
        double valor, limite;

        Conta conta;

        GerenciaConta contas = new GerenciaConta();

        do {
            AppConta.mensagem();
            op = tec.nextInt();

            switch (op) {
                case 1: // Cria CC
                    System.out.println("Digite o numero da conta:");
                    nrconta = tec.nextInt();
                    if(contas.novaContaCorrente(nrconta)) {
                        System.out.println("Conta criada");
                    } else {
                        System.out.println("Conta existente");
                    }
                    break;
                case 2: // Cria CE
                    System.out.println("Digite o numero da conta:");
                    nrconta = tec.nextInt();

                    System.out.println("Digite o limite da conta:");
                    limite = tec.nextDouble();
                    contas.novaContaEspecial(nrconta, limite);

                    break;
                case 3: // Cria CP
                    System.out.println("Digite o numero da conta:");
                    nrconta = tec.nextInt();
                    contas.novaContaPoupanca(nrconta);

                    break;
                case 4: // Deposito
                    System.out.print("Digite o numero da conta: ");
                    nrconta = tec.nextInt();
                    System.out.print("Digite o valor a depositar: ");
                    valor = tec.nextDouble();
                    contas.depositar(nrconta, valor);

                    break;
                case 5: // Saque
                    System.out.print("Digite o numero da conta: ");
                    nrconta = tec.nextInt();

                    System.out.print("Digite o valor a ser sacado: ");
                    valor = tec.nextDouble();
                    contas.sacar(nrconta, valor);

                    break;
                case 6: // Saldo
                    System.out.print("Digite o numero da conta: ");
                    nrconta = tec.nextInt();
                    System.out.println(contas.mostraSaldo(nrconta));
                case 0:

                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (op != 0);

        tec.close();
    }

    public static void mensagem() {
        System.out.println("Digite a opção:");
        System.out.println("\t(1) Criar Conta Corrente");
        System.out.println("\t(2) Criar Conta Especial");
        System.out.println("\t(3) Criar Conta Poupança");
        System.out.println("\t(4) Depósito em conta");
        System.out.println("\t(5) Saque da conta");
        System.out.println("\t(6) Detalhes da conta");
        System.out.println("\t(0) Sair");
        System.out.print(" ==> ");
    }
}
