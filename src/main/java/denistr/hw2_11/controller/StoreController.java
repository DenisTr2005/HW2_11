package denistr.hw2_11.controller;
import denistr.hw2_11.data.Basket;
import denistr.hw2_11.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }
    @GetMapping("/add")
    public List<Integer> add(@RequestParam("id") List<Integer> id) {
        return storeService.add(id);
    }
    @GetMapping("/get")
    public Basket get() {
        return storeService.get();
    }
}