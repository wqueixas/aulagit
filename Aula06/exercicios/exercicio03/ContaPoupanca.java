package exercicios.exercicio03;

public class ContaPoupanca extends Conta {
    final double TAXA=0.1;
    public ContaPoupanca(int nrconta) {
        super(nrconta);
        setTipo("CP");
    }

    @Override
    public void sacar(double valor) {
        if(valor <= getSaldo()+TAXA)
            super.sacar(valor+TAXA);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor-TAXA);
    }
    
}
