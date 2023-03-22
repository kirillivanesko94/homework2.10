package com.example.basket.service;

import com.example.basket.exception.IdNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

import static com.example.basket.model.Good.GOODS;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {
    private final List<Integer> basket = new ArrayList<>();

    @Override
    public String add(Integer... id) {
        StringBuilder sb = new StringBuilder();
        for (Integer integer : id) {
            if (GOODS.containsKey(integer)) {
                basket.add(integer);
                sb.append("Товар: ").append(GOODS.get(integer)).append(" добавлен. ");
            } else {
                throw new IdNotFoundException("Выбранного вами ID не существует.");
            }
        }
        return sb.toString();

    }

    @Override
    public List<Integer> get() {
        return basket;
    }

}
