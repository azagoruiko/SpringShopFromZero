package org.itstep.java.web.controller;

import org.itstep.java.web.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/goods")
public class GoodController {
    
    @Autowired
    GoodService goodService;
    
    @RequestMapping(value = "/all/{id}", method = RequestMethod.GET)
    public String all(
            @PathVariable(value = "id")
            Integer id,
            Model model) {
        model.addAttribute("goods", goodService.all(id));
        return "all";
    }
    
    @RequestMapping(value = "/test/{value1}/{value2}", method = RequestMethod.GET)
    public String test(
            @PathVariable(value = "value1")
            Float val1,
            @PathVariable(value = "value2")
            Float val2,
            Model model) {
        Float result = val1 / val2;
        model.addAttribute("result", result);
        return "test";
    }
}
