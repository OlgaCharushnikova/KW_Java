import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToysStore {
    private List<Toys> toys;
    private List<Toys> listToys;

    public ToysStore() {
        toys = new ArrayList<>();
        listToys = new ArrayList<>();
    }

    public void addToy(int id, String name, double weight) {
        Toys toy = new Toys(id, name, weight);
        toys.add(toy);
    }

    public void play() {
        double weight = 0;
        for (Toys toy : toys) {
            weight += toy.getWeight();
        }

        Random rand = new Random();
        double randomNumber = rand.nextDouble() * weight;

        Toys randomToy = null;
        for (Toys toy : toys) {
            if (randomNumber < toy.getWeight()) {
                randomToy = toy;
                break;
            }
            randomNumber -= toy.getWeight();
        }

        if (randomToy != null) {
            listToys.add(randomToy);
        }
    }



}
