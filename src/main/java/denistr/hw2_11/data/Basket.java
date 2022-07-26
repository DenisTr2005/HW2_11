package denistr.hw2_11.data;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
//@Repository
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