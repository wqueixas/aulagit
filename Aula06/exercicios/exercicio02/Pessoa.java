package exercicios.exercicio02;

public class Pessoa {
    private String nome, telefone;

    Pessoa(String nome, String telefone) {
        this.nome=nome;
        this.telefone=telefone;
    }

    @Override
    public String toString() {
        return nome + " (tel. " + telefone +")";
    }
    
}
