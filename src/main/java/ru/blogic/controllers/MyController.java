package ru.blogic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.logging.Logger;

@Controller
public class MyController {

    @RequestMapping("showlist") // /actions/list
    public ModelAndView showList() {
        Logger.getLogger(getClass().getName()).warning("LIST!!!!!");
        ModelAndView mv = new ModelAndView("list");
        mv.addObject("currentList", Arrays.asList("Element1", "Element2", "Element3", "<script>alert(100500)</script>"));
        return mv;
//        return new ModelAndView("list");  // просто переходим на адрес /WEB-INF/list.jsp (решает viewResolver)
    }

}
