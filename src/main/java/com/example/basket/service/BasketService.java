package com.example.basket.service;

import java.util.List;

public interface BasketService {
    String add(Integer... id);

    List<Integer> get();
}
