package denistr.hw2_11.data;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;
import java.util.List;
@Component
@SessionScope
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