package exercicios.exercicio03;

public class ContaCorrente extends Conta {
    final double tx_deposito=0.1;
    public ContaCorrente(int nrconta) {
        super(nrconta);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor-tx_deposito);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            super.sacar(valor);
        }
    }
    
}
