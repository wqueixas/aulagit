package exemplos.exemplo01;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario() {

    }
    public Funcionario(String nome) {
        this.nome = nome;
        this.salario=0.0;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario=salario;
    }

    public String exibir() {
        return nome + ", R$ " + salario ;
    }

    public void aumentarSalario(double pct) {
        this.salario+=this.salario*pct;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
}
