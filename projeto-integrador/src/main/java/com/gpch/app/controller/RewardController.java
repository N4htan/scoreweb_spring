package com.gpch.app.controller;

import com.gpch.app.model.Reward;
import com.gpch.app.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RewardController {
    @Autowired
    private RewardService rewardService;


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveReward(@ModelAttribute("reward") Reward reward) {
        rewardService.save(reward);

        return "redirect:/admin/loja";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditRewardPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("/admin/resgateConfirm");
        Reward reward = rewardService.get(id);
        mav.addObject("reward", reward);
        return mav;
    }
}
