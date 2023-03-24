package hashSetArvore;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Carro> HashSetCarro = new HashSet<>() ;

        HashSetCarro.add(new Carro("Ford"));
        HashSetCarro.add(new Carro("Fiat"));
        HashSetCarro.add(new Carro("Chevrolet"));
        HashSetCarro.add(new Carro("Peugeot"));

        System.out.println(HashSetCarro);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Fiat."));

        System.out.println(treeSetCarros);



    }
}
