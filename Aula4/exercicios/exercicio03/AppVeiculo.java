package exercicios.exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Vectra", "GM", 7.9);
        
        Veiculo v2 = new Veiculo();
        v2.modelo="Duster";
        v2.marca="Renault";
        v2.consumo=9.9;

        v1.mostraVeiculo();
        System.out.println(v1.mostraConsumo());


        System.out.println(v2.modelo + " da " + v2.marca + ", tem um consumo declarado de: " + v2.mostraConsumo() +" km/l");
        
    }
    
}
