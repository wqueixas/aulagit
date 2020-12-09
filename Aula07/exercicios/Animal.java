package exercicios;

public class Animal {
    private int anoNascimento;
    private String nome, raca, cor;
    private Proprietario prop;

    public Animal(String nome, String raca, String cor, int anoNascimento, String nomeProprietario, String telefone) {
        this.nome=nome;
        this.raca=raca;
        this.cor=cor;
        this.anoNascimento=anoNascimento;
        
        prop = new Proprietario(nomeProprietario, telefone);
    }
    @Override
    public String toString() {
        return nome+", "+raca+", "+cor+", "+anoNascimento;
    }

    public String getProprietario() {
        return prop.toString();
    }

    public String getRaca(String raca) {
        if(this.raca.equals(raca)) {
            return this.raca;
        }
        return "";
    }

}
