package exemplos.exemplo01;

public class Gerente extends Funcionario {
    private int nFuncionarios;

    public Gerente() {
        super(); // construtor da super classe
        this.nFuncionarios=0;
    }
    public Gerente(String nome) {
        super(nome); // construtor da super classe
        this.nFuncionarios=0;
    }
    public Gerente(String nome, int nFuncionarios) {
        super(nome); // construtor da super classe
        this.nFuncionarios=nFuncionarios;
    }
    public Gerente(String nome, double salario, int nFuncionarios) {
        super(nome, salario); // construtor da super classe
        this.nFuncionarios=nFuncionarios;
    }

    @Override
    public void aumentarSalario(double pct) {
        super.aumentarSalario(pct+0.2);
    }

    @Override
    public String exibir() {
        return "Sr. "+ super.exibir() + ", " + nFuncionarios+ " funcionários"  ;
    }
    
}
