package com.evansitzes.controllers;

import com.evansitzes.models.repositories.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by evan on 10/27/16.
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsRepository itemsRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public void test() {
        System.out.println("Current Items: ");
        System.out.println(itemsRepository.findAll());
    }

}
