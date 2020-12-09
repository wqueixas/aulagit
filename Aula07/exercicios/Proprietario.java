package exercicios;

public class Proprietario {
    private String nome, telefone;

    public void setTelefone(String telefone) {
        this.telefone=telefone;
    }

    public Proprietario(String nome, String telefone) {
        this.nome=nome;
        this.telefone=telefone;
    }

    public Proprietario(String nome) {
        this.nome=nome;
    }

    @Override
    public String toString() {
        return this.nome + ", "+ this.telefone;
    }
    
}
