package exercicios;

import java.util.ArrayList;
import java.util.HashMap;

public class GerenciaAnimal {
    private ArrayList<Animal> cadastro;

    public GerenciaAnimal() {
        cadastro=new ArrayList();
    }


    public void incluiAnimal(String nome, String raca, String cor, 
            int anoNascimento, String nomeProprietario, String telefone) {        
        Animal a = new Animal(nome, raca, cor, anoNascimento, nomeProprietario, telefone);
        cadastro.add(a);
    }

    public String imprime() {
        return cadastro.toString();
    }

    public String buscaDonosRaca(String raca) {
        String retorno="";
        for (Animal animal : cadastro) {
            if (animal.getRaca(raca).equalsIgnoreCase(raca)) {
                retorno = retorno +animal.getProprietario()+"\n";
            }
        }
        return retorno;
    }
    
}
