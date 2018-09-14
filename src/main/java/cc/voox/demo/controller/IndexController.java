package cc.voox.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class IndexController {

    @GetMapping({"test"})
    public String test(Model model) {
        model.addAttribute("users", Arrays.asList("张三", "李四", "jack"));
        return "test";
    }

}
