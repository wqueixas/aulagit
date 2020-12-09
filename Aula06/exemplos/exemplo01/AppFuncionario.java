package exemplos.exemplo01;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Wallace", 1000);
        Gerente g = new Gerente("Rogerio", 1000, 8);

        //f.setNome("Wallace");
        //g.setNome("Rogerio");
        f.aumentarSalario(0.1);
        g.aumentarSalario((0.1));

        System.out.println(f.exibir());
        System.out.println(g.exibir());

    }
}
