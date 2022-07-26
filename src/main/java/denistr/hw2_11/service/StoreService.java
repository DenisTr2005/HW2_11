package denistr.hw2_11.service;

import denistr.hw2_11.data.Basket;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
@Service
@SessionScope
public class StoreService {

    private Basket basket = basket();

    @Bean
    @SessionScope
    public Basket basket() {
        return new Basket(new ArrayList<>());
    }
    public List<Integer> add(List<Integer> id) {
        return basket.add(id);
    }

    public Basket get() {
        return basket;
    }
    @PostConstruct
    public void init() {
        System.out.println("создан бин StoreService");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("удален бин StoreService");
    }
}
