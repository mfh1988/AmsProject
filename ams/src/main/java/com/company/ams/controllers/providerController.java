package com.company.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class providerController {
    @RequestMapping("/welcome")
    //@ResponseBody
    public String   welcome(Model model) {
        String description = "la formation complete spring angular";
        model.addAttribute("desc",description);

        //return "Hello chers clients";
        return "provider/welcome";
    }

    @RequestMapping("/detail")
    //@ResponseBody
    public String detail(Model model) {
        int annee = 2023;
        model.addAttribute("an",annee);
        String names[] = {"mohamed","bayazid","mahmoud"};
        model.addAttribute("names",names);

        List<Provider> providers = new ArrayList<>();

        providers.add(new Provider("OPPO","Tech","21000222"));
        providers.add(new Provider("HUAWEI","Tech","21000222"));
        providers.add(new Provider("XIOMI","Tech","20002222"));

        model.addAttribute("providers",providers);
        //return "<h1 align = center>Hello chers clients</h1>";
        return "provider/detail";
    }
}
