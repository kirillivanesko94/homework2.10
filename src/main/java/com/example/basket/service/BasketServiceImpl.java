package com.example.basket.service;

import com.example.basket.exception.IdNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

import static com.example.basket.model.Good.GOODS;

@Service
@SessionScope
public class BasketServiceImpl implements BasketServiceInterface {
    private final List<Integer> basket = new ArrayList<>();

    @Override
    public String add(Integer... id) {
        String result = "";
        for (Integer integer : id) {
            if (integer > GOODS.size()) {
                throw new IdNotFoundException("Выбранного вами ID не существует.");
            }
            if (GOODS.containsKey(integer)) {
                basket.add(integer);
                result = String.format("Товар под артикулом [%s] добавлен", basket.get(integer));
            }
        }
        return result;

    }

    @Override
    public List<Integer> get() {
        return basket;
    }

}
