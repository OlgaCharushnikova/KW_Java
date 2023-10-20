import java.io.IOException;
public class MainStore {
    public static void main(String[] args) throws IOException {
        ToysStore store = new ToysStore();

        store.addToy(1, "Конструктор", 2);
        store.addToy(2, "Робот", 2);
        store.addToy(3, "Кукла", 6);

        store.play();

        try {
            store.getRandomToy();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
