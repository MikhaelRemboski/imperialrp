package net.imperialrp.imperialrpweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersController {

    @PostMapping("/addVipForm")
    public String addvip(Model model){

        return "addVipForm";
    }
}
