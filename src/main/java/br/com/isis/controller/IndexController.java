package br.com.isis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by vinic on 10/05/2017.
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView getPage(){
        return new ModelAndView("/index");
    }

}
