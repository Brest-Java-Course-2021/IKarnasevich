package com.titles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RootController {

    @RequestMapping("/")
    public final String root(Model model) {
        return "titles";
    }

    @RequestMapping("/d")
    public final String d(Model model) {
        return "directors";
    }
}
