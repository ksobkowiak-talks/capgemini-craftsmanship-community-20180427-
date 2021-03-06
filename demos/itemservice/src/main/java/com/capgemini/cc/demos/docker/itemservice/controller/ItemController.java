package com.capgemini.cc.demos.docker.itemservice.controller;


import com.capgemini.cc.demos.docker.itemservice.model.Item;
import com.capgemini.cc.demos.docker.itemservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public List<Item> items() {
        return itemService.findAll();
    }

}