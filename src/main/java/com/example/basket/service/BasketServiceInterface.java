package com.example.basket.service;

import java.util.List;

public interface BasketServiceInterface {
    String add(Integer... id);

    List<Integer> get();
}
