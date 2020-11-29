package com.gpch.app.controller;

import com.gpch.app.model.Reward;
import com.gpch.app.model.User;
import com.gpch.app.repository.RewardRepository;
import com.gpch.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private RewardRepository rewardRepository;

    @GetMapping(value={"/", "/login"})
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @GetMapping(value={"/admin/rewards"})
    public ModelAndView rewards(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByUserName(auth.getName());
        modelAndView.addObject("userName", "Bem vindo! " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
        modelAndView.addObject("userScore", "Score: " + user.getScore_id());
        modelAndView.addObject("userPontos", "Pontos: " + user.getPontos());
        modelAndView.addObject("adminMessage","Conteúdo disponível apenas para usuários com função administrativa!");
        modelAndView.setViewName("admin/rewards");
        return modelAndView;
    }

    @GetMapping(value="/registration")
    public ModelAndView registration(){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("registration");
        return modelAndView;
    }

    @PostMapping(value = "/registration")
    public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        User userExists = userService.findUserByUserName(user.getUserName());
        if (userExists != null) {
            bindingResult
                    .rejectValue("userName", "error.user",
                            "Já existe um usuário registrado com o nome de usuário fornecido!");
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("registration");
        } else {
            userService.saveUser(user);
            modelAndView.addObject("successMessage", "O usuário foi cadastrado com sucesso!");
            modelAndView.addObject("user", new User());
            modelAndView.setViewName("registration");

        }
        return modelAndView;
    }

    @GetMapping(value="/admin/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByUserName(auth.getName());
        modelAndView.addObject("userName", "Bem vindo! " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
        modelAndView.addObject("userScore", "Score: " + user.getScore_id());
        modelAndView.addObject("userPontos", "Pontos: " + user.getPontos());
        modelAndView.addObject("adminMessage","Conteúdo disponível apenas para usuários com função administrativa!");
        modelAndView.setViewName("admin/home");
        return modelAndView;
    }
    
    @GetMapping(value="/admin/loja")
    public ModelAndView loja(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByUserName(auth.getName());
        modelAndView.addObject("userName", "Bem vindo! " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
        modelAndView.addObject("userScore", "Score: " + user.getScore_id());
        modelAndView.addObject("userPontos", "Pontos: " + user.getPontos());
        modelAndView.addObject("adminMessage","Conteúdo disponível apenas para usuários com função administrativa!");
        modelAndView.setViewName("admin/loja");

        Iterable<Reward> rewards = rewardRepository.findAll();
        modelAndView.addObject("reward",rewards);
        return modelAndView;
    }


}
