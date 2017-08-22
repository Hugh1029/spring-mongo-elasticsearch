package cn.answering.controller;

import cn.answering.domain.User;
import cn.answering.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by HP on 2017/8/20.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String index(){
        return "index";
    }

    @PostMapping
    public String addUser(@RequestParam("username")String username,
                          @RequestParam("name")String name){
        User user = new User(username,name);
        userService.saveOrUpdata(user);
        return "redirect:/admins";
    }
}
