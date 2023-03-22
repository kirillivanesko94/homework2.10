package com.example.basket.model;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class Good {
    public static final Map<Integer, String> GOODS = new HashMap<>();

    static {
        GOODS.put(0, "banana");
        GOODS.put(1, "milk");
    }
}
