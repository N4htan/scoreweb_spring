package com.kindof.projetointegrador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class kindofController {

@RequestMapping("/index")
    public String index(){

    return "index";
}


@RequestMapping("/rewards")
    public String rewards(){

    return "rewards";
}

}
