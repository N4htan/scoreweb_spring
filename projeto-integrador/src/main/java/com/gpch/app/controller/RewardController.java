package com.gpch.app.controller;

import com.gpch.app.model.Reward;
import com.gpch.app.repository.RewardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RewardController {

    @Autowired
    private RewardRepository rewardRepository;

    @RequestMapping("/rewards")
    public ModelAndView listRewards(){
        ModelAndView mv = new ModelAndView("reward");
        Iterable<Reward> rewards = rewardRepository.findAll();
        mv.addObject("reward",rewards);
        return mv;
    }
}
