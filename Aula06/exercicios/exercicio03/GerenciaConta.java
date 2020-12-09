package exercicios.exercicio03;

import java.util.HashMap;

public class GerenciaConta {
    private HashMap<Integer, Conta> mapaContas;

    public GerenciaConta() {
        mapaContas = new HashMap<>();
    }

    public boolean novaContaCorrente(int nrconta) {
        Conta c = mapaContas.get(nrconta);

        if (c == null) {
            mapaContas.put(nrconta, new ContaCorrente(nrconta));
            return true;
        }
        return false;
    }

    public void depositar(int nrconta, double valor) {
        Conta c = mapaContas.get(nrconta);

        if (c != null) {
            c.depositar(valor);
        } else {
            System.out.println("Conta inexistente");
        }
    }

    public void sacar(int nrconta, double valor) {
        Conta c = mapaContas.get(nrconta);

        if (c != null) {
            c.sacar(valor);
        } else {
            System.out.println("Conta inexistente");
        }
    }

    public void novaContaEspecial(int nrconta, double limite) {
        Conta c = mapaContas.get(nrconta);

        if (c == null) {
            System.out.println("Conta existente");
        } else {
            mapaContas.put(nrconta, new ContaEspecial(nrconta, limite));
        }
    }

    public void novaContaPoupanca(int nrconta) {
        Conta c = mapaContas.get(nrconta);

        if (c == null) {
            System.out.println("Conta existente");
        } else {
            mapaContas.put(nrconta, new ContaPoupanca(nrconta));
        }
    }

    public String mostraSaldo(int nrconta) {
        Conta c = mapaContas.get(nrconta);

        if (c != null) {
            return c.getDadosConta();
        } else {
            return "Conta inexistente";
        }
    }
}
