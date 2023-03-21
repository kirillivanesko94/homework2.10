package com.example.basket.model;

import java.util.HashMap;
import java.util.Map;

public class Good {
    public static final Map<Integer, String> GOODS = new HashMap<>();

    static {
        GOODS.put(0, "banana");
        GOODS.put(1, "milk");
    }
}
