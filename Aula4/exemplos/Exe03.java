package exemplos;

public class Exe03 {
    public static void main(String[] args) {
        System.out.println(soma(2, 3));
        System.out.println(somaVarios(2,3,4));
        System.out.println(somaVarios(2,3));
        
    }

    public static Integer soma(int a, int b) {
        int soma=a+b;

        return soma;
    }

        public static void linha(int tam, char simbolo) {
        for(int i=1;i<=tam;i++){
            System.out.print(simbolo);
        }
        System.out.println("");
    }    
    public static Integer somaVarios(int... numbers) {
        int soma=0;
        for (int i=0; i<numbers.length;i++){
            soma+=numbers[i];
        }
        return soma;
    }
}
