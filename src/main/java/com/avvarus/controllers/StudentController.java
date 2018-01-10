package com.avvarus.controllers;

import com.avvarus.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class StudentController {


    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView welcome() {

        ModelAndView mv = new ModelAndView("views/HelloPage");
        return mv;
    }

    @RequestMapping(value = "/welcome1", method = RequestMethod.GET)
    public ModelAndView welcome1() {

        ModelAndView mv = new ModelAndView("views/StudentPage");
        return mv;
    }

    /*
    @RequestMapping(value = "/submitStud", method = RequestMethod.POST)
    public ModelAndView welcome1(@RequestParam("uname") String uname,
                                 @RequestParam("pwd") String pwd) {


        User user = new User(uname, pwd);

        ModelAndView mv = new ModelAndView("views/StudLogSuccess");
        mv.addObject("msg", "Values " + user.getUname() + " ---- " + user.getPwd());
        mv.addObject("user", user);
        return mv;
    }
    */

    @RequestMapping(value = "/submitStud", method = RequestMethod.POST)
    public ModelAndView welcome1(@ModelAttribute("user") User user) {

        ModelAndView mv = new ModelAndView("views/StudLogSuccess");
        mv.addObject("user", user);
        return mv;
    }

    @RequestMapping(value = "/hi/{name}/{value}")
    public ModelAndView hi(@PathVariable Map<String, String> pathVars) {

        ModelAndView mv = new ModelAndView("views/HelloStatic");
        mv.addObject("msg", pathVars.get("name") + " --- " + pathVars.get("value"));

        return mv;
    }


    @RequestMapping(value = "/submitPage", method = RequestMethod.POST)
    public ModelAndView submitPage(@RequestParam("fName") String fName,
                                   @RequestParam("lName") String lName,
                                   @RequestParam("age") String age,
                                   @RequestParam("dob") String dob,
                                   @RequestParam("college") String college) {

        ModelAndView mv = new ModelAndView("views/HelloStatic");
        mv.addObject("msg", "Values entered, we will process from here." +
                                      "Thanks for your Application");
        mv.addObject("msgVal", fName + " -- " + lName + " -- "
                                         + age + " -- " + dob + " -- " + college);
        return mv;
    }
}
