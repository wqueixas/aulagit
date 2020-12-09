package exercicios.exercicio03;

public abstract class Conta {
    private int conta;
    private double saldo;
    private String tipo;

    public Conta(int conta) {
        this.conta = conta;
        tipo="CC";
    }
    public void setTipo(String tipo) {
        this.tipo=tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getConta() {
        return conta;
    }

    public String getDadosConta() {
        return "Conta ( " +tipo + " ): " + conta + ". Saldo atual: R$ " + saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo+=valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            saldo-=valor;
        }
    }

}
