package exercicios.exercicio04;

public class Relogio {
    private int hora;
    private int minuto ;
    private int segundo;

    Relogio(int hora, int minuto, int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public String getHorario(){
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }

    public void setHora(int hh){
        if(hh >= 0 && hh < 24) {
            this.hora=hh;
        }
    }
    public void setMinuto(int valor){
        if(valor >= 0 && valor < 59) {
            this.minuto=valor;
        }
    }
    public void setSegundo(int valor){
        if(valor >= 0 && valor < 59) {
            this.segundo=valor;
        }
    }

}
