package denistr.hw2_11.service;
import denistr.hw2_11.data.Basket;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StoreService {
    private final Basket basket;
    public StoreService(Basket basket) {
        this.basket = basket;
    }
    public List<Integer> add(List<Integer> id) {
        return basket.add(id);
    }
    public List<Integer> get() {
        return basket.getId();
    }
}
