package com.netteans.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Kings on 2015/4/22.
 */
@Controller
@RequestMapping("/")
public class QueryService {

    @RequestMapping(value = "/query/{id}", method = RequestMethod.POST)
    public ModelAndView query(@PathVariable("param") String id, String param) {
        WebServiceBoost webServiceBoost = new WebServiceBoost();
        String ret = webServiceBoost.query(param);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("return", ret);
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public String query(Param param, Model model) {
        WebServiceBoost webServiceBoost = new WebServiceBoost();
        String ret = webServiceBoost.query(param.getParam());
        model.addAttribute("returm", ret);
        return "hello";
    }
}
