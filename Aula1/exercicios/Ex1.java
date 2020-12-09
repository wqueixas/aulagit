package exercicios;

public class Ex1 {
    public static void opsoma(int a, int b) {
        System.out.println("Somar(" + a + ", " + b + "): " + (a+b));
    }
    public static void opsub(int a, int b) {
        System.out.println("Subtrair(" + a + ", " + b + "): " + (a-b));
    }
    public static void opmult(int a, int b) {
        System.out.println("Multiplicar(" + a + ", " + b + "): " + (a*b));
    }
    public static void opdiv(int a, int b) {
        System.out.println("Dividir(" + a + ", " + b + "): " + (a/b));
    }
    public static void opbase(int a, int b) {
        System.out.println("Operacoes basicas entre os numeros ");
        opsoma(a, b);
        opsub(a, b);
        opmult(a, b);
        opdiv(a, b);
    }
    public static void main(String[] args) {
        opbase(17, 5);
        opbase(15, 7);
        opdiv(12, 4);
    }
}
