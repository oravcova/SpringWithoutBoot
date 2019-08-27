package com.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k",
                "l","m","n","o","p","q","r","s","t","u","v",
                "w","x","y","z"};
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        request.setAttribute("alphas",alpha);
        request.setAttribute("morse",morse);
        ModelAndView modelAndView = new ModelAndView("TableViewer");
        modelAndView.addObject(alpha);
        modelAndView.addObject(morse);
        return modelAndView;
    }
}
