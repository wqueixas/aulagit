package exercicios.exercicio02;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Wallace", "0987654321");
        Professor t1 = new Professor("Wallace", "0987654321", 1000);
        Estudante e1 = new Estudante("Wallace", "0987654321", "Java");

        System.out.println(p1);
        System.out.println(t1);
        System.out.println(e1);
    }
}
