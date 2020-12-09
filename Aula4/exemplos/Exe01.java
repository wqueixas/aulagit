package exemplos;

public class Exe01 {
    public static void main(String[] args) {
        linha(15);
        msg(" Controle ");
        linha2(10, '+');
    }

    public static void linha(int tam) {
        for(int i=1;i<=tam;i++){
            System.out.print("-");
        }
        System.out.println("");
    }  

    public static void linha2(int tam, char simbolo) {
        for(int i=1;i<=tam;i++){
            System.out.print(simbolo);
        }
        System.out.println("");
    }     
    
    public static void msg(String msg) {
        System.out.println(msg);

    }
}
