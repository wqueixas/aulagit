package exercicios.exercicio05;

public class Robo {
    private int x;
    private int y;

    public Robo(){
        this.x=0;
        this.y=0;
        getPos();
    }

    public void getPos() {
        System.out.println("\tPosição atual: ("+getX()+", "+getY()+")");
    }

    private int getX() {
        return this.x;
    }
    private int getY() {
        return this.y;
    }

    public void movimentar(String dir) {
        if (dir.equalsIgnoreCase("N")) {
            moveNorte();
        } else if (dir.equalsIgnoreCase("S")) {
            moveSul();
        } else if (dir.equalsIgnoreCase("L")) {
            moveLeste();
        } else if (dir.equalsIgnoreCase("O")) {
            moveOeste();
        }
    }
    
    private void moveNorte() {
        int posAtual=getX();
        if(posAtual >= -6 && posAtual < 6) {
            setX(posAtual+1);
        } else {
            System.out.println("Coordenada inválida!");
        }
        getPos();
    }
    private void moveSul() {
        int posAtual=getX();
        if(posAtual > -6 && posAtual <= 6) {
            setX(posAtual-1);
        } else {
            System.out.println("Coordenada inválida!");
        }
        getPos();
    }
    private void moveLeste() {
        int posAtual=getY();
        if(posAtual >= -6 && posAtual < 6) {
            setY(posAtual+1);
        } else {
            System.out.println("Coordenada inválida!");
        }
        getPos();
    }
    private void moveOeste() {
        int posAtual=getY();
        if(posAtual > -6 && posAtual <= 6) {
            setY(posAtual-1);
        } else {
            System.out.println("Coordenada inválida!");
        }
        getPos();
    }

    private void setX(int valor) {
        this.x=valor;
    }    
    private void setY(int valor) {
        this.y=valor;
    }
    
}
