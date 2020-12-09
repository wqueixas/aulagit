package exemplos.exemplo04;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 =new Pessoa("Wallace", 'M');
        //p1.nome="Wallace";
        p1.apresentar();

        Pessoa p2 = new Pessoa("Rita", 'F');
        //p2.nome="Rita";

        Pessoa p3 = new Pessoa("Mariza", 'F');

        p1.mostrar(p2.nome);
        p3.mostrar(p3.nome);
    }
}
