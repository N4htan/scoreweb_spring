package com.gpch.app.controller;

import com.gpch.app.model.Reward;
import com.gpch.app.model.User;
import com.gpch.app.service.RewardService;
import com.gpch.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {

    @Autowired
    private RewardService rewardService;

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView updateUser(User user){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/edit/{id}}");

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User currentuser = userService.findUserByUserName(auth.getName());

        userService.updateUser(currentuser);

        Iterable<Reward> rewards = rewardService.listAll();

        modelAndView.setViewName("/admin/loja");

        modelAndView.addObject("reward",rewards);
        return modelAndView;
    }
}
