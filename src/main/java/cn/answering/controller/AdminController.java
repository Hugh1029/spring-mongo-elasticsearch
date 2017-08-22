package cn.answering.controller;

import cn.answering.domain.User;
import cn.answering.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by HP on 2017/8/20.
 */

@Controller
@RequestMapping("/admins")
public class AdminController {


    @Autowired
    private UserService userService;

    @GetMapping
    public ModelAndView admin(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users",users);
        return new ModelAndView("/admin/index","userModel",model);
    }
}
