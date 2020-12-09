package exercicios.exercicio03;

public class ContaEspecial extends Conta {
    private double limite;
    public ContaEspecial (int nrconta, double limite) {
        super(nrconta);
        this.limite=limite;
        setTipo("CE");
    }

    @Override
    public void sacar(double valor) {
        if(valor <= getSaldo()+limite) {
            super.sacar(valor);
        }
    }
    
}
