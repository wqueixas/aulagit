package exercicios;

public class Placar {
    private String time1="Local", time2="Visitante";
    int score1, score2;

    public Placar() {
/*         this.time1="Equipe1";
        this.time2="Equipe2"; */
    }

    public Placar(String time1, String time2) {
        this.time1=time1;
        this.time2=time2;
        this.score1=0;
        this.score2=0;
    }
    public Placar(String time1, int score1, String time2, int score2) {
        this.time1=time1;
        this.score1=score1;
        this.time2=time2;
        this.score2=score2;
    }

    public void getPlacar() {
        System.out.printf("%s (%d X %d) %s\n\n", time1, score1, score2, time2);
    }

    public void setPlacar(int v1, int v2) {
        this.score1=v1;
        this.score2=v2;
    }

    public void setGolsTime1() {
        this.score1+=1;
    }
    public void setGolsTime2() {
        this.score2+=1;
    }
    public void anulaGolsTime1() {
        this.score1-=1;
    }
    public void anulaGolsTime2() {
        this.score2-=1;
    }
    
}
