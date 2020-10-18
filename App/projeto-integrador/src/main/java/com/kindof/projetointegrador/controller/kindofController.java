package com.kindof.projetointegrador.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
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
