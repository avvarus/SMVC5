package com.avvarus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @RequestMapping(value = "/welcome")
    public ModelAndView welcome() {

        ModelAndView mv = new ModelAndView("HelloPage");
        mv.addObject("msg", "Hello World, Welcome to new Life !!");
        return mv;
    }
}
