package exercicios;

public class AppPlacar {
    public static void main(String[] args) {
        Placar p1=new Placar();
        Placar p2=new Placar("Time A", "Time B");
        Placar p3=new Placar("Time C", 1, "Time D", 2);

        p1.setGolsTime1();
        p1.setGolsTime1();
        p1.setGolsTime2();
        p1.anulaGolsTime1();

        p1.getPlacar();
        p2.getPlacar();
        p3.getPlacar();
    }
}
