package exemplos.exemplo04;

public class Pessoa {
    String nome;
    float salario;
    char sexo;

    Pessoa(String nome) {
        this.nome=nome;
    }
    Pessoa(String nome, char sexo) {
        this.nome=nome;
        this.sexo=sexo;
    }

    void apresentar() {
        System.out.println("Olá!\nMeu nome é "+nome);
    }

    void mostrar(String nome) {
        if (this.sexo == 'F')
        System.out.println("Gostaria de apresentar pra vocês "+ nome);
    }
}
