package denistr.hw2_11.data;
import java.util.List;
public class Basket {
    private final List<Integer> id;
    public Basket(List<Integer> id) {
        this.id = id;
    }
    public List<Integer> add(List<Integer> newId) {
        id.addAll(newId);
        return newId;
    }
    public List<Integer> getId() {
        return id;
    }
}