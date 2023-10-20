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

}
