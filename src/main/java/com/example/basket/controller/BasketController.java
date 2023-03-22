package com.example.basket.controller;

import com.example.basket.exception.IdNotFoundException;
import com.example.basket.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class BasketController {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({IdNotFoundException.class})
    public String handleException(IdNotFoundException e) {
        return String.format("%s %s", HttpStatus.BAD_REQUEST.value(), e.getMessage());
    }

    @Autowired
    private BasketService basketServiceInterface;

    @GetMapping(path = "add")
    public String add(@RequestParam("id") Integer... id) {
        return basketServiceInterface.add(id);
    }

    @GetMapping(path = ("get"))
    public List<Integer> getAll() {
        return basketServiceInterface.get();
    }
}
