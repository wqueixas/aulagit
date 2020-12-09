package exercicios.exercicio03;

public class Veiculo {
    String modelo;
    String marca;
    double consumo;

    Veiculo() {
    }
    Veiculo(String modelo, String marca, double consumo) {
        this.modelo=modelo;
        this.marca=marca;
        this.consumo=consumo;
    }

    void mostraVeiculo(){
        System.out.println(modelo + ", da marca "+ marca);
    }
    double mostraConsumo(){
        return this.consumo;
    }
    
}
