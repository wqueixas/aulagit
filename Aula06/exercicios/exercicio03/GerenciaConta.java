package exercicios.exercicio03;

import java.util.HashMap;
import java.util.TreeSet;

public class GerenciaConta {
    private TreeSet<Integer> listaContas;
    private Conta conta;
    private HashMap<Integer, Conta> mapaContas;

    public GerenciaConta() {
        listaContas = new TreeSet<>();
        mapaContas = new HashMap<>();
    }

    public void novaContaCorrente(int nrconta) {
        if (listaContas.contains(nrconta)) {
            System.out.println("Conta existente");
        } else {
            listaContas.add(nrconta);
            mapaContas.put(nrconta, new ContaCorrente(nrconta));
        }
    }

    public void depositar(int nrconta, double valor) {
        if (listaContas.contains(nrconta)) {
            conta = getConta(nrconta);
            conta.depositar(valor);
        } else {
            System.out.println("Conta inexistente");

        }
    }
    public void sacar(int nrconta, double valor) {
        if (listaContas.contains(nrconta)) {
            conta = getConta(nrconta);
            conta.sacar(valor);
        } else {
            System.out.println("Conta inexistente");

        }
    }

    public void novaContaEspecial(int nrconta, double limite) {
        if (listaContas.contains(nrconta)) {
            System.out.println("Conta existente");
        } else {
            listaContas.add(nrconta);
            mapaContas.put(nrconta, new ContaEspecial(nrconta, limite));
        }
    }

    public void novaContaPoupanca(int nrconta) {
        if (listaContas.contains(nrconta)) {
            System.out.println("Conta existente");
        } else {
            listaContas.add(nrconta);
            mapaContas.put(nrconta, new ContaPoupanca(nrconta));
        }
    }

    public boolean encontraConta(int nrconta) {
        return listaContas.contains(nrconta);
    }

    public Conta getConta(int nrconta) {
        return mapaContas.get(nrconta);
    }

    public String mostraSaldo(int nrconta) {
        if (encontraConta(nrconta)) {
            conta = getConta(nrconta);
            return conta.getDadosConta();
        } else {
            return "Conta inexistente";
        }
    }
}
