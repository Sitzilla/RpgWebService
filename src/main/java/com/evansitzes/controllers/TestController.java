package com.evansitzes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by evan on 10/27/16.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public void test() {
    }

}
